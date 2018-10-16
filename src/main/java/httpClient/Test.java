package httpClient;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/3.
 */

public class Test {

    public static void main(String[] args) {
        Map map = Maps.newHashMap();

        System.out.println(map.getOrDefault("1",2));
    }
}
