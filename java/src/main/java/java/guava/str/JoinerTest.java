package java.guava.str;

import com.google.common.base.Joiner;

import java.util.Arrays;

/**
 * @author dz on 2018/10/17.
 */
public class JoinerTest {

    public static void main(String[] args) {
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));
    }
}
