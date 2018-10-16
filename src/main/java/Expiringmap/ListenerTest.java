package Expiringmap;

import net.jodah.expiringmap.ExpirationListener;
import net.jodah.expiringmap.ExpirationPolicy;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author dz on 2018/9/1.
 */

public class ListenerTest {

    public static void main(String[] args) {
        /*ExpiringMap<string,string> map = ExpiringMap.builder().variableExpiration()
                .expirationListener((thekey, thevalue) -> {
                    System.out.println("key:"+thekey+"过期");
                }).build();
        map.put("key","value", 5000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after 5 milll : "+"\n");
        System.out.println("key:"+map.get("key"));*/

        ExpiringMap<String,String> map = ExpiringMap.builder().
                variableExpiration().
                build();
        ExpirationListener<String,String> expirationListener = ((theKey, theValue)->{
            System.out.println("过期监听事件"+"key:"+theKey+" value:"+theValue);
        });
        map.put("key","value", ExpirationPolicy.CREATED,5000,TimeUnit.MILLISECONDS);
        //添加监听
        map.addExpirationListener(expirationListener);
        try {
            Thread.sleep(5001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //清除监听
        map.removeExpirationListener(expirationListener);
    }
}
