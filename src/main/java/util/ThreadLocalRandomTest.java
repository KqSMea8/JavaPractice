package util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dz on 2018/10/25.
 */
public class ThreadLocalRandomTest {
    /**
     * ThreadLocalRandom类是JDK7在JUC包下新增的随机数生成器，
     * 它解决了Random类在多线程下多个线程竞争内部唯一的原子性种子变量而导致大量线程自旋重试的不足。
     * @param args
     */
    public static void main(String[] args) {
        //(10)获取一个随机数生成器
        ThreadLocalRandom random =  ThreadLocalRandom.current();

        //(11)输出10个在0-5（包含0，不包含5）之间的随机数
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }
    }
}
