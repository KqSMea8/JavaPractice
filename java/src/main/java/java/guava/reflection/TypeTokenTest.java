package java.guava.reflection;

import com.google.common.reflect.TypeToken;

/**
 * @author dz on 2018/10/17.
 */
public class TypeTokenTest {

    public static void main(String[] args) {
        TypeToken<String> stringTok = TypeToken.of(String.class);
        System.out.println(stringTok.getType());
        TypeToken<Integer> intTok = TypeToken.of(Integer.class);
        System.out.println(intTok.getType());
        System.out.println(intTok.getRawType());
        

    }
}
