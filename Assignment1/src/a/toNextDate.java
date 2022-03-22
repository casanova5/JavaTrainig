package a;
import java.util.Scanner;

public class toNextDate{
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    //input
	    System.out.println("Enter the date: ");
	    int date = sc.nextInt();
	    System.out.println("Enter the month: ");
	    int month = sc.nextInt();
	    System.out.println("Enter the year: ");
	    int year = sc.nextInt();
	    sc.close();
	    //to check if year is leap year
	    boolean isLeap = CheckLeapYear(year);
	    
	    //to check date
	    int days_in_month = 30;
	    date +=1;
	    days_in_month = SetDaysInMonth(month, isLeap, days_in_month);
	    
	    //to calculate next
	    if (month<12 && date>days_in_month) {
	    	date = 1;
	    	month +=1;
	    }
	    else if (date>days_in_month){
	    	date = 1;
	    	month = 1;
	    	year+=1;
	    }
	 System.out.println("next date would be: "+ date + "/" + month+"/" + year);   
	}

	private static boolean CheckLeapYear(int year) {
		boolean isLeap = false;
	    if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
	    	isLeap = true;
	    }
		return isLeap;
	}

	private static int SetDaysInMonth(int month, boolean isLeap, int days_in_month) {
		if ((month == 1) || (month == 3) ||(month == 5) ||(month == 7) || (month == 8)||
	    		(month == 10) || (month == 12)) {
	    	days_in_month = 31;
	    }
	    else if (month ==2) {
	    	if(isLeap) { days_in_month = 29;}
	    	else 
	    		days_in_month = 28;
	    }
		return days_in_month;
	}

}
