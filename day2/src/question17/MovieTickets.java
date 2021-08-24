package question17;
import java.util.*;
public class MovieTickets {

	public static void main(String[] args) {
		int age;
		float st;
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enetr u r age");
		age= sc.nextInt();
		System.out.println("enetr show timing ");
		st=sc.nextFloat();
		if(age>13&&st==13.30)
		{
			System.out.println("$5.00");
		}
		else {
			System.out.println("$8.00");
		}
	
		if(age<13&&st==13.30)
		{
			System.out.println("$2.00");
		}
		else 
		{
			System.out.println("$4.00");
		}
	}

}
