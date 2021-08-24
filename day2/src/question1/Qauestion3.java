package question1;
import java .util.*;

public class Qauestion3 {

	public static void main(String[] args) {
		int sub;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the sub marks");
		 sub = sc.nextInt();
		 if(sub==100)
		 {
			 System.out.println("s");
		 }
		 else if(sub>90 && sub<100)
		 {
			 System.out.println("b");
		 }
		 else if (sub>80 && sub<90)
		 {
			 System.out.println("c");
		 }
		 else if (sub>70 && sub<80)
		 {
			 System.out.println("d");
		 }
		 else if (sub>60 && sub<70)
		 {
			 System.out.println("e");
		 }
		 else if (sub<50)
		 {
			 System.out.println("f");
		 }
		// TODO Auto-generated method stub

	}

}
