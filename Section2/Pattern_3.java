package Section2;

public class Pattern_3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= 1; j--) {

				if (i == j) {
					System.out.print(j);
				} else {
					System.out.print("  ");

				}
			}
			for(int j=2;j<=5;j++) {
				if (i == j) {
					System.out.print(j);
				} else {
					System.out.print("  ");

				}
			}

			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=5; j>=1; j--) {
				if(i==j) {
					System.out.print(j);
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=2; j<=5; j++) {
				if(i==j) {
					System.out.print(j);
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

	}

}
