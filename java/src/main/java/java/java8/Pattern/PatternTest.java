package java.java8.Pattern;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {

        Pattern p= Pattern.compile("\\d+");
        String[] str = p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        Pattern.matches("\\d+","2223");//返回true
        Pattern.matches("\\d+","2223aa");//返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到
        Pattern.matches("\\d+","22bb23");//返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到

        //Matcher类提供三个匹配操作方法,三个方法均返回boolean类型,当匹配到时返回true,没匹配到则返回false
        //matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true
        Pattern p1=Pattern.compile("\\d+");
        Matcher m=p1.matcher("22bb23");
        m.matches();//返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功.
        Matcher m2=p1.matcher("2223");
        m2.matches();//返回true,因为\d+匹配到了整个字符串

        //lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
        Pattern p2=Pattern.compile("\\d+");
        Matcher m3=p2.matcher("22bb23");
        m.lookingAt();//返回true,因为\d+匹配到了前面的22
        Matcher m4=p2.matcher("aa2223");
        m2.lookingAt();//返回false,因为\d+不能匹配前面的aa

        //find()对字符串进行匹配,匹配到的字符串可以在任何位置.
        Pattern p3=Pattern.compile("\\d+");
        Matcher m5=p3.matcher("22bb23");
        m.find();//返回true
        Matcher m6=p3.matcher("aa2223");
        m2.find();//返回true
        Matcher m7=p3.matcher("aa2223bb");
        m3.find();//返回true
        Matcher m8=p3.matcher("aabb");
        m4.find();//返回false
    }

    @Test
    public void test(){
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("aaa2223bb");
        m.find();//匹配2223
        m.start();//返回3
        m.end();//返回7,返回的是2223后的索引号
        m.group();//返回2223

        Matcher m2= p.matcher("2223bb");
        m.lookingAt();   //匹配2223
        m.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0
        m.end();   //返回4
        m.group();   //返回2223

        Matcher m3= p.matcher("2223bb");
        m.matches();   //匹配整个字符串
        m.start();   //返回0,原因相信大家也清楚了
        m.end();   //返回6,原因相信大家也清楚了,因为matches()需要匹配所有字符串x
        m.group();   //返回2223bb

    }

    @Test
    public void groupTest(){
        Pattern p=Pattern.compile("([a-z]+)(\\d+)");
        Matcher m=p.matcher("aaa2223bb");
        m.find();   //匹配aaa2223
        m.groupCount();   //返回2,因为有2组
        m.start(1);   //返回0 返回第一组匹配到的子字符串在字符串中的索引号
        m.start(2);   //返回3
        m.end(1);   //返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置.
        m.end(2);   //返回7
        m.group(1);   //返回aaa,返回第一组匹配到的子字符串
        m.group(2);   //返回2223,返回第二组匹配到的子字符串
    }
}
