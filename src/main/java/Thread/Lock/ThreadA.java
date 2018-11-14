package Thread.Lock;

public class ThreadA extends Thread{

    private MyConditionMoreService service;

    public ThreadA(MyConditionMoreService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
