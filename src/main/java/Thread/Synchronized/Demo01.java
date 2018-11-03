package Thread.Synchronized;

class SyncThread implements Runnable {
	   private static int count;
 
	   public SyncThread() {
	      count = 0;
	   }
 
	   public  void run() {
	      synchronized(this) {
	         for (int i = 0; i < 5; i++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }
 
	   public int getCount() {
	      return count;
	   }
}

//修饰一个代码块
//当一个线程访问对象的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该对象中的非synchronized(this)同步代码块
public class Demo01 {
	public static void main(String args[]){
//test01
//		SyncThread s1 = new SyncThread();
//		SyncThread s2 = new SyncThread();
//		Thread t1 = new Thread(s1);
//		Thread t2 = new Thread(s2);
//test02		
		SyncThread s = new SyncThread();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		
		t1.start();
		t2.start();
	}
}
