package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * /**
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/1.
 */

public class CollectionTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a","b","c","d");
        Collections.shuffle(list);

        System.out.println(list);
    }
}
