package java.array;

import java.util.Arrays;

/**
 * /**

 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/12.
 */

public class ArrayFillTest {

    public static void main(String[] args) {
        byte[] b = new byte[8];
        Arrays.fill(b, (byte) 1);

        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
