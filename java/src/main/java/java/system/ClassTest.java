package java.system;

import org.testng.annotations.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dz on 2018/10/24.
 */

class Candy{
    static{System.out.println("Loading Candy");}
}
class Gum{
    static{System.out.println("Loading Gum");}
}
class Cookie{
    static{System.out.println("Loading Cookie");}
    public Cookie(){
        System.out.println("initializing Cookie");
    }
}
public class ClassTest {
    public static void main(String[] args){
        Class classType;
        System.out.println("inside main");
        try{
            classType=Class.forName("system.Gum");
        }catch(ClassNotFoundException e){
            System.out.println("Couldn't not find Gum");
        }
        System.out.println("After creating Class.forName(\"Gum\")");
        classType=Candy.class;
        System.out.println("After creating Candy");
        Cookie cookie=new Cookie();
        classType=cookie.getClass();
        System.out.println("After creating Cookie");
    }


    //get package and class
    @Test
    public void getPackageAndClass(){

        //class system.ClassTest
        System.out.println(ClassTest.class);
        //class system.ClassTest
        try {
            System.out.println(Class.forName("system.ClassTest"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //调用main方法
        ClassTest.main(null);
    }

    //得到绝对路径
    @Test
    public void getPath(){
        System.out.println(Class.class.getClass().getResource("/").getPath());
    }

    //.getClass和XXX.class区别
    @Test
    public void testClassReflection(){
        ClassTest a= new ClassTest();
        System.out.println(a.getClass());
        System.out.println(ClassTest.class);

        System.out.println(a.getClass().getGenericInterfaces());
    }

    // no pass
    @Test
    public void getGenericClass() throws NoSuchFieldException {
        Type t = new Test1<String>().getClass().getDeclaredField("name").getGenericType();

        if (ParameterizedType.class.isAssignableFrom(t.getClass())) {
            for (Type t1 : ((ParameterizedType) t).getActualTypeArguments()) {
                System.out.print(t1 + ",");
            }
            System.out.println();
        }
    }

    //得到局部变量的泛型   no pass
    @Test
    public void getLocalVarGeneric(){
        List<String> lst = new ArrayList<String>(){};
        Type genType = lst.getClass().getClass().getGenericSuperclass();

        Class templatClazz = null;

        if(ParameterizedType.class.isAssignableFrom(genType.getClass()))
        {
            ParameterizedType parameterizedType = (ParameterizedType) genType;
            templatClazz = (Class) parameterizedType.getActualTypeArguments()[0];
            System.out.println(templatClazz);
        }

        System.out.println("over");

        System.out.println(Object.class.isAssignableFrom(Test1.class));
    }

    
}
class Test1<T> {
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
