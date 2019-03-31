package java.java8.Interface;

public class NestingInterfaces {
    public static void main(String[] args) {
        A a = new A();
        //The type A.D is not visible
        //D是A的私有接口，不能在外部被访问
        //! A.D ad = a.getD();
        //Cannot convert from A.D to A.DImp2
        //不能从A.D转型成A.DImpl2
        //! A.DImp2 di2 = a.getD();
        //The type A.D is not visible
        //D是A的私有接口，不能在外部被访问，更不能调用其方法
        //! a.getD().f();        
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
