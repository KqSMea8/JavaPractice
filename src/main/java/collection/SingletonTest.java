package collection;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/10/2.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * singleton(T) 方法用于返回一个不可变集只包含指定对象。
 */
public class SingletonTest {

    public static void main(String args[]) {
        // create an array of string objs
        String init[] = { "One", "Two", "Three", "One", "Two", "Three" };

        // create two lists
        List list1 = new ArrayList(Arrays.asList(init));
        List list2 = new ArrayList(Arrays.asList(init));

        // remove from list1
        list1.remove("One");
        System.out.println("List1 value: "+list1);

        // remove from list2 using singleton

        list2.removeAll(Collections.singleton("One"));
        System.out.println("The SingletonList is :"+list2);

        List list3 = Collections.singletonList(list2);
        System.out.println("list3 is : " + list3);
        //will  throw UnsupportedOperationException
        //list3.add("five");
        System.out.println("add five : " + list3);
    }
}
