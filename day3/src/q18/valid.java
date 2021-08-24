package q18;

import java.util.Scanner;


public class valid {

	public static void main(String[] args) {
	long n;
	int count=0,i=0,m,a;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		while(i<=m) {
			System.out.println("enter the number");
			a=sc.nextInt();
			if(a/8>0)
			{
				count++;
				
			}else {
				continue;
			}i++;
		}System.out.println(count);
	}

}
