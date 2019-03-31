package java.Thread.Executor;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author dz on 2018/10/30.
 */
public class ExecutorTest {

    //submit
    public static void main(String[] args){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        ArrayList<Future<String>> list=new ArrayList<>();
        for (int i = 0; i < 5; i++){
            //Future和每个线程关联
            Future<String> result=executor.submit(new task());
            list.add(result);
        }
        //遍历Future，获取返回值
        for(Future<String> f:list){
            try {
                //阻塞等待获取返回值
                System.out.println(f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executor.shutdown();

    }

    //定义Callable实现类，返回一个字符串
    static class task implements Callable<String> {
        @Override
        public String call() throws Exception {
            // TODO Auto-generated method stub
            Random random=new Random();
            int result=random.nextInt(100);
            // 第二阶段——等待所有选手准备好
            Thread.sleep((long) (random.nextInt(5) * 1000));
            return Thread.currentThread().getName()+":"+result;
        }

    }

    @Test
    public void invokeAllTest(){

        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();

        //任务链表
        List<task> tasklist=new ArrayList<>();
        //结果链表
        List<Future<String>> resultlist=new ArrayList<>();
        for (int i = 0; i < 5; i++){
            tasklist.add(new task());
        }
        try {
            resultlist=executor.invokeAll(tasklist);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        System.out.println("获取执行结果：");
        for(Future<String> f:resultlist){
            try {

                System.out.println(f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executor.shutdown();


    }


}
