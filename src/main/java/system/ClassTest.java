package system;

import org.testng.annotations.Test;

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


}
