package guava.map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author dz on 2018/10/17.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        MapDifference<String, Integer> diff = Maps.difference(left, right);

        diff.entriesInCommon(); // {"b" => 2}
        diff.entriesInCommon(); // {"b" => 2}
        diff.entriesOnlyOnLeft(); // {"a" => 1}
        diff.entriesOnlyOnRight(); // {"d" => 5}
    }
}
