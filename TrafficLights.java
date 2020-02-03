import java.lang.Exception;
import java.util.*;

class TrafficLights{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your preference:  ");
		System.out.println("1 :: Red");
		System.out.println("2 :: Yellow");
		System.out.println("3 :: Green");
		
		try{
				int val= sc.nextInt();
			
		switch(val) 
		{
			case 1: System.out.print("Stop");
					break;
			case 2: System.out.print("Ready");
					break;
			case 3: System.out.print("Go");
					break;
			default: System.out.print("Wrong Input !!" );
		}
		}catch(InputMismatchException e)
			{
			System.out.print("Entered input is incorrect  !!!");
			}	
			
		

	}
}