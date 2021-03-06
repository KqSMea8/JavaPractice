package java.Expiringmap;

import net.jodah.expiringmap.ExpirationPolicy;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

/**
 *
 *
 * @author dz on 2018/9/1.
 */

public class CreateTest {

    public static void main(String[] args) {
        ExpiringMap<String, String> map = ExpiringMap.builder().expiration(5000, TimeUnit.MILLISECONDS)
                .expirationPolicy(ExpirationPolicy.ACCESSED)
                .build();
        map.put("key","value");
        System.out.println(map.get("key"));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("访问map："+map.get("key"));
        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("访问map："+map.get("key"));

    }
}
