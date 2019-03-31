package java.DesignPattern.Decorator;

//Decorator持有Sourceable的属性，对其进行装饰
class Decorator implements Sourceable {  
      
    private Sourceable source;  
      
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method() {  
        System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
    }  
}  