package DesignPattern.builder;

import java.util.ArrayList;
import java.util.List;

//MailSender和SmsSender为Sender的接口实现类，所以可以在list中加入
//DesignModel5一个类管理着多个对象的实例
public class DesignModel5 {
    private List<Sender> list = new ArrayList<Sender>();
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
     public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    } 
    public static void main(String[] args) {  
        DesignModel5 builder = new DesignModel5();  
        builder.produceMailSender(10);  
    }  
}