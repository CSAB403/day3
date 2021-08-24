package question8;
import java.util.*;
public class qestion8 {

	public static void main(String[] args) {
		int x,y,z,n,a,b,c;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("entyer the x vlaue");
		x= sc.nextInt();
		System.out.println("entyer the y vlaue");
		y = sc.nextInt();
		System.out.println("entyer the z vlaue");
		z= sc.nextInt();
		System.out.println("entyer the n vlaue");
		n= sc.nextInt();
		a=x-n;
		b=y-n;
		c=z-n;
		if(a<0&&b<0&&c<0)
		{
			System.out.println("none of the labs are enough");
			}
			
		else if(b<a&&a<c)
		{
			System.out.println("L2 should be allocated");
		}
		else if(a<b&&a<c)
		{
			System.out.println("L1 labs cane be enough");
		}
		else
		{
			System.out.println("L3 labs cane be enough");
		}
		// TODO Auto-generated method stub

	}

}
