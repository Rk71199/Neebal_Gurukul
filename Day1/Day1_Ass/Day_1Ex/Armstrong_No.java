package Day_1Ex;

import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int num1 = (num%10);
		int num2 = (num%100)/10;
		int num3 = (num/100);
		
		int F1 = (int)Math.pow(num1, 3);
		int F2 = (int)Math.pow(num2, 3);
		int F3= (int)Math.pow(num3, 3);
		
		int sw =(F1+F2+F3);
		if (num==sw)
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
		
		sc.close();    
	}

}
