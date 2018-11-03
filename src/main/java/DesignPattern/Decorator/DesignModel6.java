package DesignPattern.Decorator;

public class DesignModel6 {
    public static void main(String[] args) {  
     //接口不能单独的实例化，必须通过实现类来帮助实例化
        Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();  
    }  
}