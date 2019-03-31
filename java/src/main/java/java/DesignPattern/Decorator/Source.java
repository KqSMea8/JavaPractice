package java.DesignPattern.Decorator;

//本来Source方法继承了Sourceable实现了method()方法
class Source implements Sourceable {  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}  