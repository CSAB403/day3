package q3;
import java.util.*;
public class LucasSequence {

	public static void main(String[] args) {
		int i=3,n,a=0,b=0,c=1,d=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enate n value");
		n = sc.nextInt();
		if(i==1)
		{
			System.out.print("0");
		}
		else if(i==2) {
			
			System.out.print("0 0");
		}
		else
		{
			System.out.print("0 0 1");
			
		}
		while(i!=n)
		{
			d=a+b+c;
			System.out.print("  "+d+ "  ");
			a=b;
			b=c;
			c=d;
			i++;
		}

	}

}
