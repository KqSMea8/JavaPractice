package commons.lang3;

import org.apache.commons.lang.*;
import org.apache.commons.lang.math.NumberUtils;
import org.testng.annotations.Test;

/**
 * @author dz on 2018/11/4.
 */
public class LangTest {
    //主要是一些公共的工具集合，比如对字符、数组的操作等等。
    public static void main(String[] args) {
        //2 截取从from开始字符串
        StringUtils.substringAfter("SELECT * FROM PERSON ", "from");
        //3 判断该字符串是不是为数字(0~9)组成，如果是，返回true 但该方法不识别有小数点和 请注意。
        StringUtils.isNumeric("454534"); //返回true
        //4.取得类名
        System.out.println(ClassUtils.getShortClassName(Test.class));
        //取得其包名
        System.out.println(ClassUtils.getPackageName(Test.class));

        //5.NumberUtils
        System.out.println(NumberUtils.stringToInt("6"));
        //6.五位的随机字母和数字
        System.out.println(RandomStringUtils.randomAlphanumeric(5));
        //7.StringEscapeUtils
        System.out.println(StringEscapeUtils.escapeHtml("<html>"));
        //输出结果为&lt;html&gt;
        System.out.println(StringEscapeUtils.escapeJava("String"));

        //8.StringUtils,判断是否是空格字符
        System.out.println(StringUtils.isBlank("   "));
        //将数组中的内容以,分隔
        String[] num = new String[]{"1","2","3"};
        System.out.println(StringUtils.join(num,","));
        //在右边加下字符,使之总长度为6
        System.out.println(StringUtils.rightPad("abc", 6, 'T'));
        //首字母大写
        System.out.println(StringUtils.capitalize("abc"));
        //Deletes all whitespaces from a String 删除所有空格
        System.out.println( StringUtils.deleteWhitespace("   ab  c  "));
        //判断是否包含这个字符
        System.out.println( StringUtils.contains("abc", "ba"));
        //表示左边两个字符
        System.out.println( StringUtils.left("abc", 2));
        System.out.println(NumberUtils.stringToInt("33"));
    }

    // 1 合并两个数组: org.apache.commons.lang. ArrayUtils
    // 有时我们需要将两个数组合并为一个数组，用ArrayUtils就非常方便，示例如下：
    @Test
    private static void testArr() {
        String[] s1 = new String[] { "1", "2", "3" };
        String[] s2 = new String[] { "a", "b", "c" };
        String[] s = (String[]) ArrayUtils.addAll(s1, s2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        String str = ArrayUtils.toString(s);
        str = str.substring(1, str.length() - 1);
        System.out.println(str + ">>" + str.length());
    }
}
