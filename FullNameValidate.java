import java.util.Scanner;
class MyException extends Exception{
	MyException(String s){
		super(s);
			}
}
class FullNameValidate{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name :");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name : ");
		String lastName = scan.nextLine();
		try{  
			 if(firstName.isEmpty() || lastName.isEmpty()){
			 	throw new MyException("Invalid user name");
			 }

		} catch(MyException e){
			System.out.println("Caught Exception!!");
			System.out.println(e.getMessage());
			return;
		}
		System.out.print("Entered name is valid..");
	}
}