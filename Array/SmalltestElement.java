package Array;

import java.util.Scanner;

public class SmalltestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Array Length :");
		int n = sc.nextInt();
		System.out.println("enter Array element :");
		int a[] = new int [n];
		int m=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for( int i=0; i<a.length;i++) {
			if (a[i]<a[m]) {
				m=i;
				
			}
			
			
		}
		System.out.println("Smallest Element of :"+m);
		
		sc.close();
	}

}
