package list;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dz on 2018/9/11.
 */

public class Test1 {
    public static void main(String[] args) {
        List<String> list = null;
        list = new ArrayList<>();
        list.add("a");
        System.out.println(list);
        list = Lists.newArrayList();
        list.add("b");
        list.clear();
        System.out.println(list);
        System.out.println(list == null);
    }
}
