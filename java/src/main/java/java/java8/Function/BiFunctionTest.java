package java.java8.Function;

import java.util.function.BiFunction;

/**
 * @author dz on 2018/11/3.
 */
public class BiFunctionTest {

    //BiFunction 接受两个参数 返回一个结果
    public static void main(String[] args) {
        System.out.println(getSum(1,2,(a,b)->a+b));
        System.out.println(getSum(1,2,(a,b)->a-b));


    }

    public static Integer getSum(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {

        return biFunction.apply(a, b);
    }

}
