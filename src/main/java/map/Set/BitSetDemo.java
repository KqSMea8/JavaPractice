package map.Set;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * @author dz on 2018/11/5.
 */
public class BitSetDemo {

    public static void main(String args[]) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }

    @Test
    public void test(){
        BitSet bitSet=new BitSet();

        bitSet.set(1);

        bitSet.set(3);

        bitSet.set(5);
        //bitSet的长度是 最大数+1=5+1=6
        System.out.println(bitSet.length());

        for(int i=0;i<bitSet.length();i=i+1) {

            System.out.print(bitSet.get(i)+"-");

        }
    }

    //有1千万个随机数，随机数的范围在1到1亿之间。
    //现在要求写出一种算法，将1到1亿之间没有在随机数中的数求出来？
    public void test2(){
        Random random=new Random();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10000000;i++)
        {
            int randomResult=random.nextInt(100000000);
            list.add(randomResult);
        }
        System.out.println("产生的随机数有");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        BitSet bitSet=new BitSet(100000000);
        for(int i=0;i<10000000;i++)
        {
            bitSet.set(list.get(i));
        }

        System.out.println("0~1亿不在上述随机数中有"+bitSet.size());
        for (int i = 0; i < 100000000; i++)
        {
            if(!bitSet.get(i))
            {
                System.out.println(i);
            }
        }
    }
}
