package java.reflection.Field;

import java.lang.reflect.Field;

class A {
    int fild = 3;
    static int staticFild = 4;
}
public class FieldTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field= A.class.getDeclaredField("fild");
        int a= (Integer)field.get(new A()) ;
//        int c= (Integer)field.get(null) ; //不是静态字段不能传null
        System.out.println(a);

        Field staticfield=A.class.getDeclaredField("staticFild");
        int b= (Integer)staticfield.get("") ;
        int d= (Integer)staticfield.get(null) ;
        System.out.println(b);
        System.out.println(d);
    }
}

