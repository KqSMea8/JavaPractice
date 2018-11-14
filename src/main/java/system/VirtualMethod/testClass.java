package system.VirtualMethod;
import java.io.*;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
 
 
public class testClass {
	
	public static void main(String args[])
	{
		 Salary s = new Salary("员工 A", "北京", 3, 3600.00);
	      Emloyee e = new Salary("员工 B", "上海", 2, 2400.00);
	      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
	      s.checkMail();
	      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
	      e.checkMail();
		
	}
	
}