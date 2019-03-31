package java.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyConditionMoreService {

    private Lock lock = new ReentrantLock();
    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(1000 * 5);

            System.out.println("methodA end ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(1000 * 5);

            System.out.println("methodB end ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void testMethod() throws Exception {
        MyConditionMoreService service = new MyConditionMoreService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadA aa = new ThreadA(service);
        aa.setName("AA");
        aa.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadB bb = new ThreadB(service);
        bb.setName("BB");
        bb.start();

        Thread.sleep(1000 * 30);
    }
}