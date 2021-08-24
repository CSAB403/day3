package question15;
import java.util.*;
public class Timesheets {

	public static void main(String[] args) {
		
		int a, b, c,d,e,f,g;
		int hour=0,hh,hh1=2;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		e= sc.nextInt();
		f= sc.nextInt();
		g= sc.nextInt();
		hour=(a*8)+(b*8)+(c*8)+(d*8)+(e*8)+(f*8)+(g*8);
		hh=(a*100)+(b*100)+(c*100)+(d*100)+(e*100)+(f*100)+(g*100);
		if(a>8)
		{
			
			System.out.println(hh+15*hh1);
		}
		else if (b>8)
		{
			System.out.println(hh+15*hh1);
		}
		else if(c>8)
		{
			System.out.println(hh+15*hh1);
		}
		else if(d>8)
		{
			System.out.println(hh+15*hh1);
		}
		else if(e>8)
		{
			System.out.println(hh+15*hh1);
		}
		else if(f>8)
		{
			System.out.println(25/100*hh+15*hh1);
		}
		else if(g>8)
		{
			System.out.println(50/100*hh+15*hh1);
		}
		System.out.println(hh);
		if(hour>40)
		{
			System.out.println(hh1*25+hh);
		}
		else   {
			System.out.println("exit");
		}
		
	}

}
