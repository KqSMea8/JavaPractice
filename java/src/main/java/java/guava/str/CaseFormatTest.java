package java.guava.str;

import com.google.common.base.CaseFormat;

/**
 * @author dz on 2018/10/17.
 */
public class CaseFormatTest {

    public static void main(String[] args) {


        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));

    }
}
