package Array;

import java.util.Scanner;

public class sales_report {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String months[] = {"january","february","march","april","may","june","july","august","september","october","november","december"};
		int sale[] = new int[12];
		int quarterly[] = new int[3];
		int t_sale = 0;
		System.out.println("Enter monthly SALES:");
		for(int i=0;i<12;i++) {
			sale[i] = sc.nextInt();
			t_sale += sale[i];
		}
		
		
		for(int i=0;i<12;i++) {

			if(i<4) {
				quarterly[0] +=  sale[i];
			}
			if(i>=4 && i<=7) {
				quarterly[1] +=  sale[i];
			}
			if(i>=8 && i<=11) {
				quarterly[2] +=  sale[i];
			}
		}
		System.out.println("Monthly SALE: ");
		for(int i=0;i<12;i++) {
			System.out.println(months[i]+" : "+sale[i]);
		}
		System.out.println();
		System.out.println("QUATERLY SALES:");
		for(int i=0;i<3;i++) {
			System.out.println("QUATERLY "+(i+1)+" "+quarterly[i]);
		}
		System.out.println();
		System.out.println("TOTAL SALE: "+t_sale);
		
	}

}
