package executor;

import java.util.concurrent.*;

/**
 *
 *
 * @author dz on 2018/9/2.
 */

public class CallableTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future future = executorService.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        try {
            System.out.println("future.get() = " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdownNow();
    }
}
