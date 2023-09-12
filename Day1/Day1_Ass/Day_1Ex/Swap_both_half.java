package Day_1Ex;

import java.util.Scanner;

public class Swap_both_half {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		 int Num = sc.nextInt(); //4523
		 int first_Half = Num%100; //23
		 int Second_Half = Num/100; //45
		 
		 System.out.println("Swap_num :"+first_Half+""+Second_Half);
		 
		 sc.close();
	}

}
