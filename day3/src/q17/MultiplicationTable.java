package q17;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		int n,m,i=1,sum;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		while(i<=m) {
			sum=i*n;
			System.out.println("the multiplication of 5 is"+sum);
			i++;
		}
	}

}
