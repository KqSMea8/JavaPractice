package java.DesignPattern.single;

/**
 * @author dz on 2018/10/22.
 *  单例模式
 */
public class SingleTest {

    private static SingleTest instance;
    //把构造器私有化
    private SingleTest(){};

    public static SingleTest getInstance() {
        if(instance ==null) {
            synchronized (SingleTest.class) {
                if(instance==null) {
                    instance = new SingleTest();
                }
            }
        }
        return instance;
    }
}
