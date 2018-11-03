package lang;

import org.testng.annotations.Test;

/**
 * @author dz on 2018/10/24.
 */
public class ProcessorTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    @Test
    public void getClassTest(){
        System.out.println(getClass() == ProcessorTest.class);
    }
}
