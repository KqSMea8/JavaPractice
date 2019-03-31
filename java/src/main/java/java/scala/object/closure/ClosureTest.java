package java.scala.object.closure;

/**
 * @author dz on 2018/11/1.
 */
public class ClosureTest {

    private class Inner implements Runnable {

          public void run() {

                System.out.println("ClosureTest.Inner.run");

         }

    }

      public Runnable getRun() {

        return new Inner();

      }

    /**
     *     闭包是一块代码可以传入另外一个地方，并且在终点处可以运行该代码。
     *     用编程语言来描述，就是指可以把一个函数（类对象）打包传入另一个函数（类对象）里，通常指客户端调用处。
     *     java闭包主要是通过接口+内部类来实现，有两种形式：接口+内部类和接口+局部内部类
     */
    public static void main(String[] args) {
        Runnable run = new ClosureTest().getRun();
        run.run();
    }
}
