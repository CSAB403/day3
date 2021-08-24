package q1;
import java.util.*;
public class AmoebaMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  months,size,i,s1=0,s2=1,s3;
		System.out.println("enter the no of month");
		months = sc.nextInt();
		for(i=2;i<months;i++)
		{
			s3=s1+s2;
			s1=s2;
			s2=s3; 
	System.out.println(" the size of the amoeba is"+s2);
			
		}

			
			
		
			
	}

}
