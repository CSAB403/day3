package question7;
import java.util.*;
public class question7 {

	public static void main(String[] args) {
		int  x,y,z;
		Scanner sc= new Scanner(System.in);
		x =sc.nextInt();
		System.out.println("enter the y  value");
		y= sc.nextInt();
		System.out.println("enter the z  value");
		z= sc.nextInt();
		if(x<y&&x<z)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else if(y<z&&y<x)
		{
			System.out.println("L2 ha s the minimalm seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal capacity seating");
		}
		// TODO Auto-generated method stub

	}

}
