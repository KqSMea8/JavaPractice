package java.guava.preconditions;

import com.google.common.base.Preconditions;
import org.testng.annotations.Test;

/**
 * @author dz on 2018/10/18.
 */
public class PreconditionsTest {

    @Test
    public void Preconditions() throws Exception {

        getPersonByPrecondition(8,"peida");

        try {
            getPersonByPrecondition(-9,"peida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,"");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getPersonByPrecondition(int age,String neme)throws Exception{

        Preconditions.checkNotNull(neme, "neme为null");
        Preconditions.checkArgument(neme.length()>0, "neme为\'\'");
        Preconditions.checkArgument(age>0, "age 必须大于0");

        System.out.println("a person age:"+age+",neme:"+neme);
    }
}
