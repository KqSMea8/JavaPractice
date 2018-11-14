package commons.BeanUtils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dz on 2018/11/4.
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("tom");
        person.setAge(21);
        try {
            //克隆
            Person person2 =  (Person) BeanUtils.cloneBean(person);
            System.out.println(person2.getName()+">>"+person2.getAge());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        }



    }

    @org.testng.annotations.Test
    public void test() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        //  原理也是通过Java的反射机制来做的。
        //  2、 将一个Map对象转化为一个Bean
            //  这个Map对象的key必须与Bean的属性相对应。
        Map map = new HashMap();
        map.put("name","tom");
        map.put("email","tom@");
        map.put("age","21");
        //将map转化为一个Person对象
        Person person = new Person();
        BeanUtils.populate(person,map);
        //  通过上面的一行代码，此时person的属性就已经具有了上面所赋的值了。
        //  将一个Bean转化为一个Map对象了，如下：
        Map map1 = BeanUtils.describe(person);
    }


}
