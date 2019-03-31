package java.reflection.Method;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dz on 2018/11/3.
 */
public class MethodTest {

    public static void main(String[] args) {
        //System.out.println(getSingleAbstractMethod(AbstractTest.class));
        System.out.println(getAllDeclaredMethods(AbstractTest.class));
    }

    @Test
    public static Method getSingleAbstractMethod(Class<?> baseClass) {
        Method sam = null;
        for (Method method : baseClass.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers())) {
                if (sam == null) {
                    sam = method;
                } else {
                    System.out.println("error");
                }
            }
        }
        return sam;
    }

    public static List<Method> getAllDeclaredMethods(Class<?> clazz) {
        List<Method> result = new ArrayList<>();
        while (clazz != null) {
            Method[] methods = clazz.getDeclaredMethods();
            Collections.addAll(result, methods);
            clazz = clazz.getSuperclass();
        }
        return result;
    }
}
