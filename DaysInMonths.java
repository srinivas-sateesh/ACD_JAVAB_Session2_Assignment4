import java.util.Scanner;

public class DaysInMonths {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the name of the month");
		String month = reader.next();
		switch(month.toUpperCase())
		{
			case "JANUARY":
			case "JAN":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
			case "FEBRUARY":
			case "FEB":
					System.out.println("Number of days in " + month + " is " +  "28");
					break;
			case "MARCH":
			case "MAR":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
			case "APRIL":
			case "APR":
					System.out.println("Number of days in " + month + " is " +  "30");
					break;
			case "MAY":
			 
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
			case "JUNE":
			case "JUN":
					System.out.println("Number of days in " + month + " is " +  "30");
					break;
			case "JULY":
			case "JUL":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
			case "AUGUST":
			case "AUG":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
					
			case "SEPTEMBER":
			case "SEP":
					System.out.println("Number of days in " + month + " is " +  "30");
					break;
			case "OCTOBER":
			case "OCT":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
			case "NOVEMBER":
			case "NOV":
					System.out.println("Number of days in " + month + " is " +  "30");
					break;
			case "DECEMBER":
			case "DEC":
					System.out.println("Number of days in " + month + " is " +  "31");
					break;
					
			default:
					System.out.println("Please enter the complete month name or the first 3 letters");
					break;
		}
					
					
					
			
	 
		
		
	}

}
