package Day_1Ex;

public class Largest_Num {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		int num3 = 5;
		
		int a = num1<num2 ? num2 : num1;
		int b = a>num3 ? a : num3;
		
		System.out.println(b);
	}

}
