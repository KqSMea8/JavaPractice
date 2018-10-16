package map;

import org.testng.collections.Maps;

import java.util.Map;
import java.util.Random;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/8/14.
 */

public class Third {
    public static void main(String[] args) {
        /*Random random = new Random();
        for (int i = 0; i < 2; i++) {
            System.out.println(random.nextInt(1000) + " : " + random.nextInt(1000)+ " : " +random.nextInt(90) );

        }*/

        Map<String,String> map = Maps.newHashMap();
        System.out.println(map.isEmpty());
    }
}
