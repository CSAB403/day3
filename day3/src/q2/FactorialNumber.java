package q2;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		int n,i=1,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
			if(n==fact)
			{
				System.out.println("yes");break;
			}
			 System.out.println(fact);	
		}	
	}

}
