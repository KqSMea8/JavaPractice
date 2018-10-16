package array;

import java.util.Arrays;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/12.
 */

public class ArrayFillTest {

    public static void main(String[] args) {
        byte[] b = new byte[8];
        Arrays.fill(b, (byte) 0);
        System.out.println(b[1]);
    }
}
