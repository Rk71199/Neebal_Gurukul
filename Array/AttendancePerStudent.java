package Array;

public class AttendancePerStudent {

	public static void main(String[] args) {
		int []arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int sum =0;
		double n=arr.length;
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
		}
		
		System.out.println("Percentage of student:"+(sum/n)*100);
	}

}
