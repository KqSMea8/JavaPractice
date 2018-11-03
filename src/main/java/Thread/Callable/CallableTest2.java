package Thread.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * @author dz on 2018/10/2.
 */
public class CallableTest2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
               Callable<Integer> task2 = () -> { System.out.println("fdfdf");return new Integer(100); };
               FutureTask<Integer> task1 = new FutureTask<Integer>(task2);
               Thread thread1 = new Thread(task1, "THREAD-1");
                thread1.start();
                System.out.println(task1.get());
    }
}
