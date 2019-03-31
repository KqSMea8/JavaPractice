package java.Thread.Lock;

import org.testng.annotations.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dz on 2018/11/14.
 */
public class LockTest{

        private Lock lock = new ReentrantLock();

        @Test
        public void testMethod(){

            lock.lock();
            for (int i = 0 ;i < 5;i++){
                System.out.println("ThreadName = " + Thread.currentThread().getName() + (" " + (i + 1)));
            }


            lock.unlock();
        }

    public static void main(String[] args) throws InterruptedException {

        LockTest service = new LockTest();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();

        Thread.sleep(1000 * 5);
    }
}
