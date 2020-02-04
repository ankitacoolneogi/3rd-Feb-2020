import java.lang.Exception;
import java.util.*;

class PrimesTillN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j , count=0;
		System.out.print("Enter a range upto which primes are to be printed :: ");
		try{
			 n = sc.nextInt();
		}catch(InputMismatchException e)
			{
			System.out.print("Entered input is incorrect  !!!");
			return;
			}	

		for (i=1 ; i<=n ; i++) {
			j=1;
			while(j<=i)
				{if (i%j == 0)
					count ++;
				j++;
				}	
			if (count == 2) 
				System.out.print(i + " ");	
		count=0;	
		}

	}
}