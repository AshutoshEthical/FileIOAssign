package FileIO;

import java.io.Serializable;

public class Lab8_3Employee implements Serializable {
	String empName;
	int empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Lab8_3Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
}
