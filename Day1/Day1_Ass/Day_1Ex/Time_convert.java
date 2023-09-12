package Day_1Ex;

import java.util.Scanner;

public class Time_convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int time = sc.nextInt();
		int cov_f = time%100;
		int cov_t = time/100;
		if (cov_t>11) {
			if(cov_t==12)
			    System.out.println(time+">>>"+(cov_t)+":"+cov_f+"pm");
			else
				System.out.println(time+">>>"+(cov_t-12)+":"+cov_f+"pm");
		}
		else if(cov_t==00)
			System.out.println(time+">>>"+(cov_t+12)+":"+cov_f+"am");
		else
			System.out.println(time+">>>"+cov_t+":"+cov_f+"am");
			
		
			
		sc.close();	
		}
	}


