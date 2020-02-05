package com.cg.eis.exception;
import java.util.Scanner;
class EmployeeException extends Exception{
	EmployeeException(){
		super();
			}
}
class SalaryValidation{
	public static void main(String[] args) {
		System.out.println("Enter employee salary");
		Scanner scan = new Scanner(System.in);
		int sal = scan.nextInt();
		try{
			if(sal < 3000)
              throw new EmployeeException();
			System.out.println("Valid");
			return ;
			
		}catch(Exception e){
			System.out.println("Salary should not be less than 3000...");
			return;
		}
	}
}