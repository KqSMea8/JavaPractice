package java.Thread.HoldsLock;

import org.testng.annotations.Test;

/**
 * @author dz on 2018/11/5.
 */
public class HoldsLocksTest {

    Object o = new Object();
    //java.lang.Thread中有一个方法叫holdsLock()，
    // 它返回true如果当且仅当当前线程拥有某个具体对象的锁
    @Test
    public void test1() throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(o) {
                    System.out.println("child thread: holdLock: " +
                    Thread.holdsLock(o));
                }
            }
        },"test1").start();
        System.out.println("main thread: holdLock: " + Thread.holdsLock(o));
        Thread.sleep(2000);
    }
}
