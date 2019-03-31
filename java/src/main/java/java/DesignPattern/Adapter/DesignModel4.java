package java.DesignPattern.Adapter;

public class DesignModel4 {
    public static void main(String args[]) { 
         Window win = new WindowImpl(); // 实现接口对象  
        // 调用方法   
        win.open();   
        win.close();
   }  
}