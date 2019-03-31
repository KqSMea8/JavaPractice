package java.java8.Interface;

class A {
    private interface D {
        void f();
    }
    private class DImp implements D {
        public void f() {}
    }
    public class DImp2 implements D {
        public void f() {}
    }
    public D getD() { return new DImp2(); }


    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}


