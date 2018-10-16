package owner;

import org.aeonbits.owner.Config;

import java.util.List;

/*
 * 数组和集合的类型转换：
 * @Separator与@TokenizerClass可以用在方法上，只影响该方法；也可以用在类上，影响整个类
 * @Separator和@TokenizerClass不能在同一级别上使用，否者会抛UnsupportedOperationException
 */
public interface MyConfig extends Config {

    @DefaultValue("3.1415")
    double pi();

    // 默认情况下，OWNER使用逗号","字符为数组和集合标记值  
    @DefaultValue("apple, pear, orange")
    public String[] fruit();

    // 用@Separator注释指定不同的字符（和regexp）  
    @Separator(";")
    @DefaultValue("0; 1; 1; 2; 3; 5; 8; 13; 21; 34; 55")
    public int[] number();

    @DefaultValue("1, 2, 3, 4")
    List<Integer> ints();

    // 复杂的拆分逻辑可以自定义，使用@TokenizerClass注解  
    @TokenizerClass(MyTokenizer.class)
    @DefaultValue("foo-bar-baz")
    public String[] customize();
}  