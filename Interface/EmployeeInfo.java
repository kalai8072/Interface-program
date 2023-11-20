package org.Abstract;

public class EmployeeInfo implements Employee {
	
	public void employeeName () {
		
		String employeeName = ("Kalai");
		System.out.println("The employee name is :"+" "+ employeeName);
	}
	
	public void address () {
		
		String address = ("No-5,Rajiv gandhi street, velachery, Chennai.");
		System.out.println("The employee address is :"+" "+ address);
		
	}
	public void workdesign () {
		
		String workdesign = ("Manager");
		System.out.println("The employee work design is :"+" "+ workdesign);
	}
	public void salery () {
		
		int salery = 50000;
		System.out.println("The employee Salery is :"+" "+ salery);
	}

	
	
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.employeeName();
		emp.address();
		emp.salery();
		emp.workdesign();
	}
	

}
