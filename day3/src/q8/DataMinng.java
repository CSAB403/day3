package q8;
import java.util.Scanner;
public class DataMinng {

	public static void main(String[] args) {
	int std_roll_no,n1,sum=0,sum1=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter std roll number");
	std_roll_no=sc.nextInt();
	if (std_roll_no>0)
	{
		for(int i=0;i<4;i++)
		{
		n1=std_roll_no%10;
		if(n1%2==0)
		{
			sum=sum+n1;
		}else
		{
			sum1=sum1+n1;
		}std_roll_no=std_roll_no/10;
	}
	if(sum==sum1)
	{
		System.out.println("topper batch of the std");
	}
	
	else
	{
		System.out.println("not from topper batch");
	}
	}

	}}
