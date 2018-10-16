package Thread;

import java.util.concurrent.Callable;

/**
 *
 * @author dz on 2018/9/7.
 */

public class CallableTest {


    public void start(){
        retry(() -> { return  true;});
    }

    private void retry(Callable<Boolean> callable) {
        int count = 0;
        int retry = 20;
        while ((count++) < retry) {
            try {
                if (callable.call()) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
