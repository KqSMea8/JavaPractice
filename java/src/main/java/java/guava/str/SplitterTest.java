package java.guava.str;

import com.google.common.base.Splitter;

/**
 * @author dz on 2018/10/17.
 */
public class SplitterTest {

    public static void main(String[] args) {
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, , brown, foxjumps, over, the, lazy, little dog."));
    }
}
