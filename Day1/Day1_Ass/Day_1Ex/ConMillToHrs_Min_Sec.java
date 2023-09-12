package Day_1Ex;

public class ConMillToHrs_Min_Sec {

	public static void main(String[] args) {
		int time = 7000234;
		
		int Sec = (time/1000)%60;  //1sec = 1000Sec
		
		int min = (time/60000)%60; //1min=60000milisec
		
		int hrs = time/3600000;    //1house= 3600000
		
		System.out.println(hrs+":"+min+":"+Sec);
	
		
	}

}
