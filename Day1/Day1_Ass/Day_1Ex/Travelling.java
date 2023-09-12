package Day_1Ex;

import java.util.Scanner;

public class Travelling {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner (System.in);
		int X = Sc.nextInt();
		
		int P_trav = 50*(X/50);
		
		System.out.println("PeopleTravelling ="+ P_trav);
		Sc.close();
	}

}
