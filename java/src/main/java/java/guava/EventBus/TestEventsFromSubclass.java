package java.guava.EventBus;

import com.google.common.eventbus.EventBus;
import org.testng.annotations.Test;

public class TestEventsFromSubclass {
    @Test
    public void testEventsFromSubclass() throws Exception {  
       
        EventBus eventBus = new EventBus("test");
        //Integer 是 Number的子类
        IntegerListener integerListener = new IntegerListener();  
        NumberListener numberListener = new NumberListener();  
        eventBus.register(integerListener);  
        eventBus.register(numberListener);  
       
        eventBus.post(new Integer(100));  
       
        System.out.println("integerListener message:"+integerListener.getLastMessage());
        System.out.println("numberListener message:"+numberListener.getLastMessage());

        eventBus.post(new Long(200L));  
        //Long 也是Number的子类,但是和integer没有关系，integer还是原先的值
        System.out.println("integerListener message:"+integerListener.getLastMessage());
        System.out.println("numberListener message:"+numberListener.getLastMessage());

        /** result :
         * Message:100
         * Message:100
         * integerListener message:100
         * numberListener message:100
         * Message:200
         * integerListener message:100
         * numberListener message:200
         */
    }
}