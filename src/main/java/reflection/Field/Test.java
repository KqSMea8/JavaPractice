package reflection.Field;

import java.lang.reflect.Field;

public class Test {

    public int num = 0;

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        //使用反射第一步:获取操作类FieldDemo所对应的Class对象
        Class<?> cls = Class.forName("reflection.Field.Test");
        //使用Test类的class对象生成 实例
        Object obj = cls.newInstance();
        //通过Class类中getField(String name)： 获取类特定的方法，name参数指定了属性的名称
        Field field = cls.getField("num");

        //拿到了Field类的实例后就可以调用其中的方法了
        //方法:get(Object obj) 返回指定对象obj上此 Field 表示的字段的值
        System.out.println("属性值:  " + field.get(obj));

        //方法: set(Object obj, Object value)  将指定对象变量上此 Field 对象表示的字段设置为指定的新值
        field.set(obj, 55);
        System.out.println("修改属性值后 --> get(Object obj):  " + field.get(obj));
    }
}
