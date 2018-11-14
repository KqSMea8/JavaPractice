package system.VirtualMethod;
 
public class Emloyee {
	private String name;
	private String address;
	private int num;
	/*含参构造函数*/
	public Emloyee(String name, String address, int number) {
		System.out.println("Employee 构造函数");
		this.name = name;
		this.num = number;
		this.address = address;
	}
	public void checkMail() {
		System.out.println("邮票支票给： "+ this.name +" " + this.address );
	}
	
	public String toString() {
		return name + " " + address + " " + num;
	}
	public String getName() {
		return name;
	}
	public String address() {
		return address;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public int getNumber() {
		return num;
	}
}