package java8.Interface;

public interface Flower{
//接口默认是abstract的的
//public abstract interface Flower{

    interface FlowerHeart{
        //接口中定义的变量默认是public static final 型，且必须给其初值
        public static final int age  = 99;

    }
    //嵌套接口默认是public，下面写法也可以
    //public interface FlowerHeart{}


    //嵌套接口默认是public，不能是private，下面写法错误
    //private interface FlowerHeart{}


}
