package question13;
import java.util.*;
public class Budget {

	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		if(a<30&&b<20&&c<20&&d<10&&e<10)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
