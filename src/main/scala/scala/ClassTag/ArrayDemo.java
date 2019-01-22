package scala.ClassTag;

import org.omg.CORBA.Any;

class ArrayDemo<T>{
  
    //public T[] arrays = new T[10]; //创建泛型数组不可以，编译不通过

    public T[] makeArray(int size)  {

    //return new T[size];//错误信息还是： 创建泛型数组

        return null;
    }
}