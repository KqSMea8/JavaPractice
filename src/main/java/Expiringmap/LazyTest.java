package Expiringmap;

import net.jodah.expiringmap.ExpiringMap;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/1.
 */

public class LazyTest {

    public static void main(String[] args) {
        Map<String, Connection> map = ExpiringMap.builder()
                .expiration(5000, TimeUnit.MILLISECONDS)
                .expirationListener((theKey,theValue)->{
                    System.out.println("过期key:"+theKey);
                })
                .entryLoader(address -> new Connection((String) address))
                .build();
        System.out.println(map.get("127.0.0.1"));
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Connection {
        String ipAddress;
        public Connection(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        @Override
        public String toString() {
            return "Connection{" +
                    "ipAddress='" + ipAddress + '\'' +
                    '}';
        }
    }
}
