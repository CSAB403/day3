package q16;
import java.util.Scanner;
public class CountPositiveveAndNegitive {

	public static void main(String[] args) {
		int n,a,i=1,sum=0,count=0,count1=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("enter a value");
			a=sc.nextInt();if(a>0) {count++;
				
			}else {
				count1++;
			}
		
			i++;
		}System.out.println(count);
		System.out.println(count1);

	}

}
