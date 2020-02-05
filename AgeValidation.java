import java.util.Scanner;
class MyException extends Exception{
	MyException(String s){
		super(s);
			}
}
class AgeValidation{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		try{  
			 if(age < 15) {
			 	throw new MyException("Invalid age");
			 }

		} catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println(e.getMessage());
			return;
			}
		System.out.print("Entered age is valid..");
		return;
	}
}