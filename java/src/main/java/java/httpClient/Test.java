package java.httpClient;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 *
 * @author dz on 2018/9/3.
 */

public class Test {

    public static void main(String[] args) {
        Map map = Maps.newHashMap();

        System.out.println(map.getOrDefault("1",2));
    }
}
