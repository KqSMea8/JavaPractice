package DesignPattern.Adapter;

//子类继承WindowAdapter抽象类，选择性实现需要的方法
class WindowImpl extends WindowAdapter {   
 public void open() {   
     System.out.println("窗口打开");// 实现open()方法  
 } 
 public void close() {   
     System.out.println("窗口关闭");// 实现close()方法  
 }   
} 