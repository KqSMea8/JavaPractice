package java.guava.reflection;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dz on 2018/10/17.
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<String> stringList = Lists.newArrayList();
        ArrayList<Integer> intList = Lists.newArrayList();
        System.out.println(stringList.getClass().isAssignableFrom(intList.getClass()));

        List<String> list = new ArrayList<String>();
        System.out.println(List.class.isAssignableFrom(list.getClass()));


    }

}


