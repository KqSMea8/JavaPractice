package reflection.Modifier;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author dz on 2018/10/31.
 */
public class ModifierTest {

    //通过反射判断类或变量、方法的修饰符
    public static void main(String[] args) {
        Class<?> clazz = MyTest.class;

        Field[] fields = clazz.getDeclaredFields();//获取这个类所有的成员变量

        for(Field field : fields) {

            System.out.println(field.getName() + " ---> " + field.getModifiers() + "---> " + Modifier.toString(field.getModifiers()));

        }

    }
}
