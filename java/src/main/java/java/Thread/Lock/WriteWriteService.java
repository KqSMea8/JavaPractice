package java.Thread.Lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteWriteService {
    //写写互斥
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(){
        try{
            try{
                lock.writeLock().lock();
                System.out.println("获得写锁" + Thread.currentThread().getName() +
                        " " +System.currentTimeMillis());
                Thread.sleep(1000 * 10);
            }finally {
                lock.writeLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        WriteWriteService service = new WriteWriteService();

        Thread a = new Thread(service::write);
        a.setName("A");

        Thread b = new Thread(service::write);
        b.setName("B");

        a.start();
        b.start();
        Thread.sleep(1000 * 30);

    }
}