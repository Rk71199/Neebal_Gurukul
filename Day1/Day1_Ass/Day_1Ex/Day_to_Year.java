package Day_1Ex;

public class Day_to_Year {

	public static void main(String[] args) {
		
		int days = 1020;
		int year = days/365; days-=365*year;
		int months =days/30; days-=30*months;
		int weeks = days/7; 
		int day=days-=7*weeks;
       
		System.out.println("Year:Months:weeks:Days "+ year +" "+months+" "+weeks+" "+ day);
	}

}
