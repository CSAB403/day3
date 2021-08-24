package q13;
import java.util.Scanner;

public class Print3 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(a>0&&a<=b)
		{
			System.out.println(a);
			a++;
		}
		while(a>=b&&a>0);
		{
			System.out.println(a);
			a--;
		}


	}

}
