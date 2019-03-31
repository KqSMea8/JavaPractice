package java.Thread;

/**
 * @author dz on 2018/10/23.
 */
public class ThreadTest {


    public static void main(String[] args) {
              getStackTraceTest();

    }
    //返回一个表示该线程堆栈转储的堆栈跟踪元素数组。
    // 如果该线程尚未启动或已经终止，则该方法将返回一个零长度数组。
    // 如果返回的数组不是零长度的，则其第一个元素代表堆栈顶，它是该序列中最新的方法调用。
    // 最后一个元素代表堆栈底，是该序列中最旧的方法调用。
    public static  void getStackTraceTest() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
            System.out.println(String.format("%s : %s : %d", stackTrace[i].getMethodName(), stackTrace[i].getFileName(), stackTrace[i].getLineNumber()));
            System.out.println("**************");
        }

    }
    


}