package q15;

import java.util.Scanner;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		int n,a,i=1,sum=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("enter a value");
			a=sc.nextInt();if(a>0) {
				sum=sum+a;count++;
			}else {
				
			}
		
			i++;
		}System.out.println(count);
		System.out.println(sum);

	}

}
