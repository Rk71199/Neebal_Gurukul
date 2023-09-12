package Section2;

public class Pattern_4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				if (i == j) {
					System.out.print(" *");
				} else {
					System.out.print("  ");

				}
			}
			for (int j = 1; j <= 8; j++) {

				if (i == 1 || i == 5) {
					System.out.print(" *");
				} else {
					System.out.print("  ");

				}
			}
			for (int j = 8; j <= i; j++) {

				if (i == j) {
					System.out.print(" *");
				} 
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" *");
			System.out.println();
		}
		
	}
}

