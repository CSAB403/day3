package question6;
import java.util.*;
public class qestion6 {

	public static void main(String[] args) {
		int current,birth,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year of birth");
		birth= sc.nextInt();
		System.out.println("enter the current year");
		current = sc.nextInt();
		if(current<birth)
		{
			birth=100-birth;
			a=birth+current;
			System.out.println("your age is" +a);
		}
		
		else
		{
			System.out.println("your age is" +(current-birth));
		}
		// TODO Auto-generated method stub

	}

}
