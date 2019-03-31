package java.list;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author dz on 2018/9/6.
 */

public class Test {
    public static void main(String[] args) {
        List<Result> list1 = Lists.newArrayList(new Result("1",1),new Result("2",1));
        List<Result> list2 = Lists.newArrayList(new Result("2",1),new Result("2",3));

        System.out.println(list1.stream().allMatch(list2::contains));

        System.out.println(CollectionUtils.isEqualCollection(list1,list2));

        String result = "";
        for (int i = 0; i < list1.size(); i++) {
            if (! (list1.get(i).getWord().equals(list2.get(i).getWord()) && list1.get(i).getCount() == list2.get(i).getCount())){
                result += list1.get(i).toString() + " *** " + list2.get(i).toString()  + "\n";
            }
        }
        System.out.println(result);

        System.out.println("**********************");
        String temp = "";
        for (int i = 0; i < list1.size(); i++) {
            if (! list1.get(i).equals(list2.get(i))){
                temp += list1.get(i).toString() + " *** " + list2.get(i).toString()  + "\n";
            }
        }
        System.out.println(temp);
    }
}
