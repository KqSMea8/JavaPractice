/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class HbaseActions {
    private static final Logger LOGGER = LoggerFactory.getLogger(HbaseActions.class);

    private HBaseAdmin admin;

    // default value
    protected String        zkQuorum;
    protected String        zkRoot;
    private   Configuration conf;

    public HbaseActions(HbaseConfig hbaseConfig) {
        this.zkQuorum = hbaseConfig.getZkQuorum();
        this.zkRoot = hbaseConfig.getZkRoot();

        Configuration config = new Configuration();
        config.set("hbase.zookeeper.quorum", this.zkQuorum);
        config.set("zookeeper.znode.parent", this.zkRoot);
        config.set("hbase.zookeeper.property.clientPort", "2181");
        config.setInt("hbase.rpc.timeout", 60000 * 6);
        config.setInt("hbase.client.pause", 3000); //hbase重试的休眠时间,默认是1000ms

        this.conf = HBaseConfiguration.create(config);

        conf.setInt("hbase.client.retries.number", 3);
        conf.setInt("hbase.htable.threads.max", 4);
        conf.setInt(HConstants.HBASE_REGIONSERVER_LEASE_PERIOD_KEY, 300000);

    }

    public void truncateTable(String tableName) {
        LOGGER.info("truncate table {}", tableName);

        try {
            admin = new HBaseAdmin(conf);
        } catch (MasterNotRunningException e) {
            e.printStackTrace();
        } catch (ZooKeeperConnectionException e) {
            e.printStackTrace();
        }

        if (admin != null) {
            try {
                admin.disableTable(tableName);
            } catch (IOException e) {
                e.printStackTrace();
            }

                //admin.truncateTable(tableName);


            try {
                if (admin.isTableDisabled(tableName)) {
                    admin.enableTable(tableName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                admin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws Exception {

        String zkQuorum = "";

        String zkRoot = "";

        Configuration config = new Configuration();
        config.set("hbase.zookeeper.quorum", zkQuorum);
        config.set("zookeeper.znode.parent", zkRoot);
        config.set("hbase.zookeeper.property.clientPort", "2181");
        config.setInt("hbase.rpc.timeout", 60000 * 6);
        config.setInt("hbase.client.pause", 3000); //hbase重试的休眠时间,默认是1000ms

        Configuration conf = HBaseConfiguration.create(config);

        conf.setInt("hbase.client.retries.number", 3);
        conf.setInt("hbase.htable.threads.max", 4);
        conf.setInt(HConstants.HBASE_REGIONSERVER_LEASE_PERIOD_KEY, 300000);

        HBaseAdmin admin = new HBaseAdmin(conf);
        //admin.disableTable(table_name);
        //admin.truncateTable("failover_case_2");
        //admin.enableTable(table_name);
        admin.close();

    }
}