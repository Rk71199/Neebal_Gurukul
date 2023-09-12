package Mini_project;

import java.util.Scanner;

public class LegoSetCompetition_M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the lego Set Competition!");
		////
		
		
		 outer: do {
			 
			    String lego1;
				String lego2;
				String lego3;
				int total;
		
			System.out.println("Enter the name of Lego Set 1");
			 lego1 = sc.next();
			
			 
			System.out.println("Enter the number of pieces in Lego set 1");
			int num1 = sc.nextInt();
			
			
			System.out.println("Enter the name of Lego Set 2");
			 lego2 = sc.next();
			
			 
			System.out.println("Enter the number of pieces in Lego set 2");
			int num2 = sc.nextInt();
			
			
			System.out.println("Enter the name of Lego Set 3");
			 lego3 = sc.next();
			
			//
			System.out.println("Enter the number of pieces in Lego set 3");
			int num3 = sc.nextInt();
			
			

			 total = num1 + num2 + num3;
			System.out.println(" sum of 3 lego set :" + total);
		 
	
		
		 
			Competitionlog c[] = new Competitionlog[2];
			c[0] = new Competitionlog(1, "", lego1 + "" + lego2 + " " + lego3, 0);
			c[1] = new Competitionlog(2, "", lego1 + "" + lego2 + " " + lego3, 0);
			
			
			int i =1;
			while (true) {
				System.out.println("Enter the number of pieces Player 1 used for building on day " + i + ":");
				int temp1 = sc.nextInt();
				c[0].setPiecesBuilt(c[0].getPiecesBuilt()+temp1);
			

				System.out.println("Enter the number of pieces Player 2 used for building on day " + i + ":");
				int temp2 = sc.nextInt();
				
				c[1].setPiecesBuilt(c[1].getPiecesBuilt()+temp2);
				i++;
				if (c[0].getPiecesBuilt()>= num1) {
					c[0].setCompleteSets(lego1);
					c[0].setIncompleteSets(lego2+" "+lego3);
				}
				
				if (c[0].getPiecesBuilt()>= num1+num2) {
					c[0].setCompleteSets(lego1+" "+lego2);
					c[0].setIncompleteSets(lego3);
				}
				if (c[0].getPiecesBuilt()>= total) {
					c[0].setCompleteSets(lego1+" "+lego2+" "+lego3);
					c[0].setIncompleteSets("");
				}
				
				if (c[1].getPiecesBuilt()>= num1) {
					c[1].setCompleteSets(lego1);
					c[1].setIncompleteSets(lego2+" "+lego3);
				}
				
				if (c[1].getPiecesBuilt()>= num1+num2) {
					c[1].setCompleteSets(lego1+" "+lego2);
					c[1].setIncompleteSets(lego3);
				}
				if (c[1].getPiecesBuilt()>= total) {
					c[1].setCompleteSets(lego1+" "+lego2+" "+lego3);
					c[1].setIncompleteSets("");
				}
					
				if (c[0].getPiecesBuilt()>=total && c[1].getPiecesBuilt()>=total) {
					System.out.println("The Competition ended in a tie! There will be a tiebreaker round");
					

					 continue outer;
					
				}
				else if (c[0].getPiecesBuilt() >= total) {
					System.out.println("congratualtions to player 1 for  winning the lego set Competition! ");
					System.out.println(c[0]);
					System.out.println(c[1]);
					break outer;
				}
				if (c[1].getPiecesBuilt() >= total) {
					System.out.println("congratualtions to player 2 for  winning the lego set Competition! ");
					System.out.println(c[0]);
					System.out.println(c[1]);
					break outer;

				}
			
			
			
			}
			
		 }while(true);
			
		 
	}
	
}
		

