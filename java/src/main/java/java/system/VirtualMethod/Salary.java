package java.system.VirtualMethod;
 
public class Salary extends Emloyee {
	
	private double salary;//	全年工资
	
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	/*方法的重写，返回值，参数不可变*/
	public void checkMail() {
		System.out.println("Salary 类的mailCheckBox方法");
		System.out.println("邮票支票给: "+ getName() + ", 工资为： " + salary);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("gongzi :" + getName());
		return salary/52;
	}
}