package p1;

public class Employee {
	private int empID = 0;
	private String empName = null;
	private String desg = null;
	private int sal = 0;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	public int bonus() {
		return (sal/2);
	}
	

}
