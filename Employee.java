
public class Employee {
	Integer empid;
	String empname;
	Integer salary;
	public Employee(Integer empid, String empname, Integer salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	};
	
}
