package com.cg.eis.exception;

import com.cg.eis.bean.Employee5_1;

public class Lab6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Employee5_1 e1 = new Employee5_1(101, "Ashu", 2000, "System Associate");
		e1.check(e1.salary);
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
