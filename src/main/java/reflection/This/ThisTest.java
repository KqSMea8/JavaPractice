package reflection.This;

import java.lang.reflect.Field;

/**
 * @author dz on 2018/11/1.
 */
public class ThisTest {//this$0

    public class FirstInner {//this$1

        public class SecondInner {//this$2

            public class ThirdInner {
            }
        }
    }

    public static void main(String[] args) throws Exception {

        //初始化各内外实例
        ThisTest test = new ThisTest();
        FirstInner first = test.new FirstInner();
        FirstInner.SecondInner second = first.new SecondInner();
        FirstInner.SecondInner.ThirdInner third = second.new ThirdInner();

        System.out.println(test.hashCode());
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        //Outer,this$0
        Field outerfield = first.getClass().getDeclaredField("this$0");
        outerfield.setAccessible(true);
        Object object = outerfield.get(first);
        System.out.println(object.getClass()+","+object.hashCode());

        //FirstInner,this$1
        Field firstInnerfied = second.getClass().getDeclaredField("this$1");
        firstInnerfied.setAccessible(true);
        object = firstInnerfied.get(second);
        System.out.println(object.getClass()+","+object.hashCode());

        //SecondInner,this$2
        Field secondInnerfield = third.getClass().getDeclaredField("this$2");
        secondInnerfield.setAccessible(true);
        object = secondInnerfield.get(third);
        System.out.println(object.getClass()+","+object.hashCode());

    }
}
