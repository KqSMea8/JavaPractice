package DesignPattern.Adapter;

//定义抽象类实现接口，在此类中覆写方法，但是所有的方法体为空
abstract class WindowAdapter implements Window {   
 public void open() {   
 };// 窗口打开
 public void close() {   
 };// 窗口关闭  
 public void iconified() {   
 };// 窗口最小化 
 public void deiconified() {   
 };// 窗口恢复   
 public void activated() {   
 };// 窗口活动   
}   