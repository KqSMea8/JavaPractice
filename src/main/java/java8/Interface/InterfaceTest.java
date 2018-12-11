package java8.Interface;

public interface InterfaceTest {

    int a = 10;//全局变量默认强制是 public static final
    
     public static void staticMethod() {  //静态方法，JDK1.8下编译通过
         System.out.println("");
     }
     
      int abstractMethod(); //抽象方法
     
     public static abstract class InnerClass{//抽象内部类，默认强制 public static
         //......
     }
     
     enum MyEnum{RED,BLUE,GRREN} //枚举类，默认强制 public static
     
     interface InnerInteerface{ //嵌套接口，默认强制 public static
         void aa();
     }
}

class MyClass implements InterfaceTest{//实现上面的接口

    @Override
    public int abstractMethod() {//实现抽象方法
        
        return 0;
    }
}


