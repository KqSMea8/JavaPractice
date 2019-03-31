package java.DesignPattern.ProxyPattern;

public class DesignModel7 {
    public static void main(String[] args) {
        Sourceable1 source = new Proxy1();
        source.method(); 
    }
}