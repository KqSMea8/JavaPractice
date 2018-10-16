package Expiringmap;

import net.jodah.expiringmap.ExpirationPolicy;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/1.
 */

public class SingleExpire {

    public static void main(String[] args) {
        ExpiringMap<String, String> map = ExpiringMap.builder().variableExpiration()
                .expirationPolicy(ExpirationPolicy.CREATED)
                .build();
        map.put("key1","value1",ExpirationPolicy.ACCESSED,5000, TimeUnit.MILLISECONDS);
        map.put("key2","value2",10000,TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("key1:"+map.get("key1"));
        System.out.println("key2:"+map.get("key2"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("key1:"+map.get("key1"));
        System.out.println("key2:"+map.get("key2"));
    }
}
