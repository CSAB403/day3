package q9;
import java.util.Scanner;
public class SpecialNumber {

	public static void main(String[] args) {
		int n,first,last,sum,prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		n=sc.nextInt();
		while(n>=10&&n<=99)
		{
			first=n/10;
			last=n%10;
			sum=first+last;
			prod=first*last;
		
		 if(sum+prod==n)
		{
			System.out.println("It is special nnumber");
		}
		else
		{
			System.out.println("It is not aspecial number");
		}break;
	
		}
	}
		

}
