package java8.Unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author dz on 2019/2/15.
 */
public class UnsafeTest {

    //通过反射获取单例对象theUnsafe。
    private static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
