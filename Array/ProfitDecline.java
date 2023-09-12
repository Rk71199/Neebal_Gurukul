package Array;

public class ProfitDecline {

	public static void main(String[] args) {
		
		int []profit = {12,18,20,38,53,93,77,61,59,56};
		int res =0;
		for(int i=0; i<profit.length;i++) {
			
			if (profit[i]>profit[i+1]) {
				
				res=i+2001+1;
				System.out.println("Year in Deline in profit :"+res);
				break;
				
			}
				
			
		}
		
	}

}
