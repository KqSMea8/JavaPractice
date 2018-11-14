package Thread.Lock;

public class ThreadB extends Thread{

    private MyConditionMoreService service;

    public ThreadB(MyConditionMoreService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}