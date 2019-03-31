package java.Thread.Lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadReadService {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try{
            try{
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName() +
                " " + System.currentTimeMillis());
                Thread.sleep(1000 * 10);
            }finally {
                lock.readLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadReadService service = new ReadReadService();
        Thread a = new Thread(service::read);
        a.setName("A");

        Thread b = new Thread(service::read);
        b.setName("B");

        a.start();
        b.start();
    }
}