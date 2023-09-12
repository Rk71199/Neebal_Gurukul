package Section2;

public class Pattern_2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j=(2*i)-1; j >=i; j--) {
				System.out.print((char)(j+64));
		}
		System.out.println();
	}
		for (int i = 4; i >= 1; i--) {
			for (int j=(2*i)-1; j >=i; j--) {
				System.out.print((char)(j+64));
		}
		System.out.println();
	}
}
}