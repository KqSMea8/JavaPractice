package java.DesignPattern.ProxyPattern;

//注意装饰器模式持有的是接口的实例，代理模式持有的是实现类的实例
 class Proxy1 implements Sourceable1{
     private Source1 source1;
     public Proxy1() {
        super();
        this.source1 = new Source1();
    }
    //重写Sourceable1的method()方法，并且持有的Source1实现类是实例也进行操作
    @Override
    public void method() {
        before();
        source1.method();
        after();
    }
    private void before() {  
        System.out.println("before proxy!");  
    }  
    private void after() {  
        System.out.println("after proxy!");  
    }  
 }