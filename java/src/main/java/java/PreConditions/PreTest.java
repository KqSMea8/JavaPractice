package java.PreConditions;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;


public class PreTest {

    public static void main(String[] args) {

        Preconditions.checkArgument(1==1);
        System.out.println("---------------------");
        //Preconditions.checkArgument(1==2);
        String a = null;
        Preconditions.checkNotNull(a, "hostName is null");


    }
}
