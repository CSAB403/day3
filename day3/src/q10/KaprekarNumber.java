package q10;
import java.util.*;
public class KaprekarNumber {

	public static void main(String[] args) {
		int k,count=0,sum=0;
		double t;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the k value");
		k=sc.nextInt();
	    int pow=(int)Math.pow(k, 2);
		System.out.println( pow);
		while(pow!=0)
		{
			pow=pow%10;
			sum=sum=pow;
			
			pow=(int)pow%10;
			
		}
		System.out.println(sum);
			if (sum ==pow)
			{
				System.out.println("kaprekar number");			
			}
			else
			{
				System.out.println("not kaprekar number");
			}
		
		
	}

}
