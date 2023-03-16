package LinkedHashMapASS;

public class Employee {
	
	private int id;
	private String empName;
	public Employee(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
