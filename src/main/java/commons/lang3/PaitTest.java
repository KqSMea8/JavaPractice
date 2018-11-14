package commons.lang3;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @author dz on 2018/11/3.
 */
public class PaitTest {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new ImmutablePair<>(2, "Two");
        Integer key = pair.getKey();
        String value = pair.getValue();

        System.out.println(key);
        System.out.println(value);
    }
}
