package Array;

import java.util.Scanner;

public class RevOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of Array :");
		int n = sc.nextInt();
		System.out.println("Please Enter element of Array :");
		int a[]= new int [n];
		for( int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0,j=(a.length-1);j>i;i++,j--) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			
		}
		for( int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
sc.close();
	}

}
