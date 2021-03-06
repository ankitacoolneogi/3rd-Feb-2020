import java.lang.Exception;
import java.util.*;


class Fibonacci_Recursion{

	static int control=3;

	public static void main(String[] args) {

		int count, option;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N-th element : : ");

		try{
			count = sc.nextInt();
		
			System.out.print("1. Recursive function\n2. Non-recursive function\n\n\tenter your Option ::");
		
			option = sc.nextInt();
			switch(option){
				case 1: System.out.println("THE " + count + "th ELEMENT IN FIBONACCI SERIES IS : " + fibonacci_using_recursion(1,1,count));
						break;
				case 2: fibonacci(1,1,count);
						break;
				default: System.out.println("Invalid option !! ");
			}
		}catch(InputMismatchException e)
			{
			System.out.print("Entered input is incorrect  !!!");
			}
		}


	static void fibonacci(int i, int j, int count){

		int temp=0, c=2;
		while(c<count) {
			temp = i + j;
			i=j;
			j=temp;
			c++;	
		}
		System.out.println("THE " + count + "th ELEMENT IN FIBONACCI SERIES IS : " + temp);
	}


	static int fibonacci_using_recursion(int i, int j, int count){
		if(control < count){
			control++;
			return(fibonacci_using_recursion(j,(i+j), count));
		}
		else 
			return (i+j); 
	}
}