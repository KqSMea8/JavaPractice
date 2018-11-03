package util;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;

/**
 * @author dz on 2018/10/23.
 */
public class UUIDTest {

    public static void main(String[] args) {
        //随机生成UUID  eg:0736026a-8b99-4ed1-a4f5-3ed7cee4dccf
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }

    // 生成5个字符的验证码：
    @Test
    public void  generate5Charater(){
        String content="ABCDEFGHIJKLMNOPQRSTUVWHYZ";//创建23个大写字母的字符串
        content+=content.toLowerCase();//把大写字母转换成小写字母，相连接
        content+="0123456789";//连接0~9的数字。
        Random r=new Random();//创建一个随机数对象
        StringBuilder b=new StringBuilder(5);//创建空间大小为5的StringBuilder对象
        for (int i = 0; i <5; i++) {
            char n=content.charAt(r.nextInt(content.length()));//截取一个从0到content.length()之间的字符，循环输出5个不同的字符，追加到一起
            b.append(n);
        }
        System.out.println(b.toString());//转成字符串输出5个字符
    }
}
