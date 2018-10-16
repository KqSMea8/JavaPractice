package map;

import org.testng.collections.Maps;

import java.util.Map;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/11.
 */

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map = Maps.newHashMap();
        System.out.println(map == null);
        map.put("1",1);
        System.out.println(map);
        map.clear();
        System.out.println(map);
        System.out.println(map == null);
    }
}
