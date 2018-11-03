package Thread.Synchronized;

class MyThread extends Thread {
  
    private Sync sync;  
  
    public MyThread(Sync sync) {  
        this.sync = sync;  
    }  
  
    public void run() {  
        sync.test();  
    }  
}  