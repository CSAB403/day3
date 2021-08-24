package question16;
import java.util.*;
public class MicroOwen {

	public static void main(String[] args) {
		int item;
		float ht,rht;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of items");
		item=sc.nextInt();
		System.out.println("enter the single heating time");
		ht=sc.nextFloat();
		if(item==1)
		{
			rht=(ht)+(0.10f*ht)+(item);
			System.out.println(rht);
		}
		else if(item==2)
		{
			rht=(50/100*ht)+((1.10f)*ht)+(item);
			System.out.println(rht);
		}
		else if(item==3)
		{
			rht=(2*ht)+(10*ht)+(item);
			System.out.println(rht);
		}
		else
		{
			System.out.println(" more number of items are not recommended");
		}
	}

}
