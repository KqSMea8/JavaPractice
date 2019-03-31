package java.a_leetcode.test;

import java.util.Scanner;

/**
 * @author dz on 2018/10/21.
 */
public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num = Integer.parseInt(sc.nextLine());
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
             str[i] = sc.nextLine();
        }

        for (int i = 0; i < num; i++) {
             StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                  if(str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z'){
                       if(str[i].charAt(j-1) >= 'A' && str[i].charAt(j-1) <= 'Z'){
                           sb.append(str[i].charAt(j)+32);
                           continue;
                       }
                       if(i==0){
                          // sb.append()
                       }
                       sb.append("_"+str[i].charAt(j)+32);

                  }else{
                      sb.append(str[i].charAt(j)+32);
                  }
            }
            System.out.println(sb.toString());
        }
    }


}
