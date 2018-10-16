package string;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/2.
 */

public class StringFormatTest {

    public static void main(String[] args) {
        String HOST = "http://stable.kepler.alipay.com";
        String baseUrl = HOST + "/api/job/%d/ops/start";
        System.out.println(String.format(baseUrl, 1));
    }
}
