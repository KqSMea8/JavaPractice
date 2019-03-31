package java.Expiringmap;

import net.jodah.expiringmap.ExpiringMap;

import java.util.Map;

/**
 *
 * @author dz on 2018/9/1.
 */

public class MaxSize {

    public static void main(String[] args) {
        Map<String, String> map = ExpiringMap.builder().maxSize(10)
                .build();
        //向Map中插入10个数
        for (int i = 0;i<10;i++){
            map.put("a:"+i,"v:"+i);
        }
        System.out.println("a:0未过期："+map.get("a:0"));
        System.out.println("插入a:10后");
        map.put("a:10","v:10");
        System.out.println("a:0过期："+map.get("a:0"));
        System.out.println("a:1未过期："+"a:1");

        map.put("a:11","v:11");
        System.out.println("a:0 :"+map.get("a:0"));
        System.out.println("a:1 :"+map.get("a:1"));
        System.out.println("a:2 :"+map.get("a:2"));
    }
}
