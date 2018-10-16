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

public class Expiringmap {

    public static void main(String[] args) {
        ExpiringMap<String, String> map = ExpiringMap.builder().expiration(5000, TimeUnit.MILLISECONDS)
                .expirationPolicy(ExpirationPolicy.CREATED)
                .build();
        map.put("key","value");
        System.out.println("key:"+map.get("key"));
        //等待5秒
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map.get("key"));
    }
}
