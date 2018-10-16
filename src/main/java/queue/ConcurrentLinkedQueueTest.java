package queue;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author dz on 2018/10/16.
 */
public class ConcurrentLinkedQueueTest {

    public static void main(String[] args) {
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.offer("dz");
        System.out.println("offer后，队列是否空？" + queue.isEmpty());
        System.out.println("从队列中poll：" + queue.poll());
        System.out.println("pool后，队列是否空？" + queue.isEmpty());
    }

    @Test
    public void peekTest(){
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.offer("dz");
        System.out.println("offer后，队列是否空？" + queue.isEmpty());
        System.out.println("从队列中peek：" + queue.peek());
        System.out.println("从队列中peek：" + queue.peek());
        System.out.println("从队列中peek：" + queue.peek());
        System.out.println("pool后，队列是否空？" + queue.isEmpty());
    }

    @Test
    public void removeTest(){
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.offer("dz");
        System.out.println("offer后，队列是否空？" + queue.isEmpty());
        System.out.println("从队列中remove已存在元素 ：" + queue.remove("dz"));
        System.out.println("从队列中remove不存在元素：" + queue.remove("123"));
        System.out.println("remove后，队列是否空？" + queue.isEmpty());
    }

    @Test
    public void containsTest(){
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.offer("123");
        System.out.println(queue.contains("123"));
        System.out.println(queue.contains("234"));
    }

    @Test
    public void toArrayTest(){
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.offer("123");
        queue.offer("234");
        Object[] objects = queue.toArray();
        System.out.println(objects[0] + ", " + objects[1]);

        //将数据存储到指定数组
        String[] strs = new String[2];
        queue.toArray(strs);
        System.out.println(strs[0] + ", " + strs[1]);
    }

    @Test
    public void iteratorTest(){
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.offer("123");
        queue.offer("234");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
