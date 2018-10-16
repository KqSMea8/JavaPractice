package executor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * /**
 *
 * @author dz on 2018/9/2.
 */

public class InvokeTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = null;
        try {
            futures = executorService.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(Future<String> future : futures){
            try {
                System.out.println("future.get = " + future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
