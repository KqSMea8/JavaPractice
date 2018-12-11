package map.IdentityHashMap;

import java.util.IdentityHashMap;

public class Test {
    //IdentityHashMapTest判断两个对象是否相等的标准：是通过==来判断是否相等

    public static void main(String[] args) {
        IdentityHashMap ihm= new IdentityHashMap();
        //IdentityHashMap通过==来判断两个new String对象是不相等的，所以作为两个不同的对象加入
        ihm.put(new String("语文"), 89);
        ihm.put(new String("语文"), 93);
        System.out.println(ihm);
        //由于java是一个字符串，直接将它放在常量池中，故认为是两个相同的对象，。。所以就只会作为一个对象加入
        ihm.put("java", 88);
        ihm.put("java",90);
        System.out.println("第二次的ihm"+ihm);

    }
}
