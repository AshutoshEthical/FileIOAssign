package com.cg.eis.exception;

public class EmployeeException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Salary cannot be less than 3000";
		
		//return super.getMessage();
	}
}
