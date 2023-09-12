package Day_1Ex;

import java.util.Scanner;

public class Amount {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in) ;
		System.out.println("Name :");
		String Name = sc.nextLine() ;
		System.out.println("Unit :");
		int unit = sc.nextInt();
		
		double result = 0 ;
		if(unit<=100)
			result = unit*4;
		else if (unit <= 300) {
			result = 400;
			unit = unit -100;
			result= unit*5;
		}
		else {
			result = 1400;
			unit = unit - 300 ;
			result+= unit * 10 ;
			
		}
		if (result >= 1000) {
			result = result + result*0.05;
		}
		result = result + result*0.18;

		
		System.out.println("Name :"+Name);
		System.out.println("Unit :"+unit);
		System.out.println("Amount :"+result);
		sc.close();
	}

}
