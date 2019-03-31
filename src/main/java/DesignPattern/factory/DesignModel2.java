package DesignPattern.factory;

public class DesignModel2 {

    public static void main(String[] args) {

        Animal a = null; // 定义接口对象

        String animal = "cat";
        a = Factory.getInstance(animal); // 通过工厂获取实例
        if (a != null) { // 判断对象是否为空  
            a.say(); // 调用方法   
        }   
    } 
}