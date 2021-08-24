package question14;
import java.util.*;
public class CircleIntersection {

	public static void main(String[] args) {
		int x1,x2,y1,y2,r1,r2 ;
		double power,dist,radius;
		Scanner sc= new Scanner(System.in);
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		r1=sc.nextInt();
		r2=sc.nextInt();
		power = Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		 dist = Math.sqrt(power);
		 radius=r1+r2;
		if(dist>radius)
			
		{
			System.out.println("will not overlap");
		}
		else if(dist==radius)
		{
			System.out.println("will tangential");
		}
		else
		{
			System.out.println("will overlap");
		}
		

	}

}
