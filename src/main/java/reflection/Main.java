package reflection;

import java.lang.reflect.Field;

public class Main {
  
    public static void main(String[] args) throws Exception {  
        Class clazz = Class.forName("reflection.AccessibleTest");
        AccessibleTest at = new AccessibleTest();  
        at.setId(1);  
        at.setName("AT");  
        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);//AccessibleTest类中的成员变量为private,故必须进行此操作
            System.out.println(f.get(at));//获取当前对象中当前Field的value
            System.out.println("sleep 2");
            Thread.sleep(2 * 1000);
        }

        System.out.println("job over ！");
    }  
  
}  
