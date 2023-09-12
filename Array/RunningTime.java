package Array;

public class RunningTime {

	public static void main(String[] args) {
		
		int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
			int min = 0;
		for(int i=0 ; i<ev.length-1;i+=2) {
			int h1 = ev[i]/100;
			int h2 = ev[i+1]/100;
			int m1 = ev[i]%100;
			int m2 = ev[i+1]%100;
			
			min +=(h2-h1)*60+(m2-m1);
		}
		 int time_a1= min/60;
		 int time_a2= min%60;
		 
		 System.out.println("total Running time is :"+time_a1+"hr"+time_a2+"min");
	}

}
