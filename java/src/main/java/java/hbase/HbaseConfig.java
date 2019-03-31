/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package java.hbase;


public class HbaseConfig {
    private String zkQuorum;
    private String zkRoot;

    public String getZkQuorum() {
        return zkQuorum;
    }

    public void setZkQuorum(String zkQuorum) {
        this.zkQuorum = zkQuorum;
    }

    public String getZkRoot() {
        return zkRoot;
    }

    public void setZkRoot(String zkRoot) {
        this.zkRoot = zkRoot;
    }
}