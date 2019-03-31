package java.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author dz on 2018/9/5.
 */

public class Test {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("11232");
            }
        }, 2000 , 1000);
    }
}
