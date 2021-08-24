package question11;
import java.util.*;
public class HotelTariifCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int month, n;
		float roomrent;
		System.out.printf("enter mont no" );
		month =sc.nextInt();
		System.out.printf("enter roomate");
		roomrent =sc.nextFloat();
		System.out.println("enter the no of days stayed in hotel");
		n=sc.nextInt();
		switch(month)
		{
		case 1:	System.out.printf("%2.f",n*roomrent);
		break;
		case 2:	System.out.printf("%2.f",n*roomrent);
		break;
		case 3:	System.out.printf("%2.f",n*roomrent);
		break;
		case 4:	System.out.printf("%2.f",(20/100*n*roomrent));
		break;
		case 5:	System.out.printf("%2.f",(20/100*n*roomrent));
		break;
		case 6:	System.out.printf("%2.f",(20/100*n*roomrent));
		break;
		case 7:	System.out.printf("%2.f",(20/100*n*roomrent));
		break;
		case 8:	System.out.printf("%2.f",n*roomrent);
		break;
		case 9:	System.out.printf("%2.f",n*roomrent);
		break;
		case 10:System.out.printf("%2.f",n*roomrent);
		break;
		case 11:System.out.printf("%2.f",(29/100)*n*roomrent);
		break;
		case 12:System.out.printf("%2.f",(20/100*n*roomrent));
		break;
		default:System.out.printf("invalid");
		}
		
		// TODO Auto-generated method stub

	}

}
