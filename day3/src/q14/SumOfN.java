package q14;
import java.util.Scanner;
public class SumOfN {
	public static void main (String []args) {
int n,a,i=1,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(i<=n) {
	System.out.println("enter a value");
	a=sc.nextInt();
	sum=sum+a;
	i++;
}System.out.println(sum);
	}
}
