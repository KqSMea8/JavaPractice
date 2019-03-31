package java.util;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author dz on 2018/10/25.
 */
public class RandomTest {

    public static void main(String[] args) {

        //(1)创建一个默认种子的随机数生成器
        Random random = new Random();
        //(2)输出10个在0-5（包含0，不包含5）之间的随机数
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }
    }

    @Test
    public void twoRandomTest(){
        Random random1 = new Random(50);
        Random random2 = new Random(50);

        System.out.println("random1 : " + random1.nextInt());
        System.out.println("random2 : " + random2.nextInt());
    }
}
