/**
 * 
 */


import java.util.Arrays;

/**
 * 
 */
public class RainfallData {
	
	public static final int DAYS_IN_YEAR = 365;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// array of arrays containing the monthly rainfall data
		 int[][] monthlyRainfall = {
		 // January (31 days)
		 { 12, 8, 23, 4, 0, 9, 2, 3, 11, 14, 7, 18, 15, 1, 0, 2, 4, 0, 1, 1, 0, 0, 1, 0, 10, 3, 2, 0, 0, 0, 3 },
		 // February (28 days)
		 { 3, 6, 9, 5, 7, 2, 4, 7, 6, 8, 7, 9, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 2, 0, 9, 8, 0, 6 },
		 // March (31 days)
		 { 1, 8, 0, 11, 8, 5, 7, 8, 4, 3, 7, 6, 5, 9, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 // April (30 days)
		 { 3, 6, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 2 },
		 // May (31 days)
		 { 2, 5, 8, 7, 6, 9, 8, 2, 7, 5, 3, 6, 8, 9, 4, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 },
		 // June (30 days)
		 { 0, 6, 5, 8, 9, 6, 4, 7, 6, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 // July (31 days)
		 { 1, 6, 0, 9, 7, 6, 5, 4, 8, 9, 6, 5, 7, 7, 4, 6, 8, 7, 5, 3, 7, 9, 8, 6, 5, 9, 0, 0, 2, 0, 0 },
		 // August (31 days)
		 { 7, 6, 5, 8, 9, 6, 5, 4, 7, 6, 5, 9, 0, 0, 2, 0, 0, 0, 2, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 },
		 // September (30 days)
		 { 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 9, 1, 1, 0, 0, 0, 0, 2, 3, 8, 0, 0, 0, 1, 1, 0, 0 },
		 // October (31 days)
		 { 2, 5, 0, 0, 6, 0, 0, 0, 0, 5, 3, 0, 0, 0, 4, 6, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0 },
		 // November (30 days)
		 { 7, 0, 5, 4, 8, 9, 6, 4, 3, 7, 6, 5, 8, 7, 6, 5, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 },
		 // December (31 days)
		 { 2, 5, 8, 7, 6, 9, 8, 7, 5, 6, 3, 6, 9, 1, 2, 3, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 1 } };
		 
		 // string array of strings representing the names of each month to help with indexing
		 String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		 
		 System.out.println("--------------------------------------------------------------------------------------------------------------------------\n");
		 System.out.println("Rainfall Analysis");
		 System.out.println("Rainfall per month (mm)\n");
		 
		 // displays monthly rainfall to console
		 displayRainfall(monthlyRainfall, months);
		 
		 // displays method outputs to the console
		 System.out.printf("\nHeaviest day rain total :\t"+returnHeaviestRainfall(monthlyRainfall)+"(mm)");
		 System.out.printf("\nTotal of rain in year :\t\t"+returnTotalYearRainfall(monthlyRainfall)+"(mm)");
		 System.out.printf("\nRainfall average per day :\t"+"%.2f", (double)returnTotalYearRainfall(monthlyRainfall) / DAYS_IN_YEAR);
		 System.out.println();
		 System.out.println("\nTotal rain days per month");
		 
		 // for loop that will return the array for total rain days in each month
		 for (int i = 0; i < months.length; i++) {
			 System.out.println(months[i]+"\t"+returnTotalRainDaysPerMonth(monthlyRainfall, months)[i]);
		 }
		 // prints the highest rain month to console by using thr index passed from the method in the month array of strings
		 System.out.println("\nMonth with the most rainfall volume : \t"+months[returnHighestRainMonth(monthlyRainfall, months)]);
		 
		 System.out.println("\nRain visual - mm of rain on wet days sorted(asc)\n");
		 
		 displayVisualRainfallStats(monthlyRainfall, months);
		 
		 System.out.println("\n--------------------------------------------------------------------------------------------------------------------------\n");

		 
		 
		 

	}
	
	
	public static void displayRainfall(int[][] monthlyRainfall, String[]months) {
		
		// nested for loop that will iterate through arrays and display to console
		for (int row = 0; row < monthlyRainfall.length; row++) {
			System.out.printf(monthIndex(monthlyRainfall, months, row)+"\t");
			for (int col = 0; col < monthlyRainfall[row].length; col++) {
				
				System.out.printf("%-4d",monthlyRainfall[row][col]);
			}
			// puts each month on a new line
			System.out.println();
		}
		
	}
	
	// returns amount in mm of what the heaviest rainfall was
	public static int returnHeaviestRainfall(int[][] monthlyRainfall) {
		// count for working out the day with the largest int of rainfall
		int rainfall = 0;
		// nested for loop to iterate through each month
		for (int row = 0; row < monthlyRainfall.length; row++) {
			for (int col = 0; col < monthlyRainfall[row].length; col++) {
				if (monthlyRainfall[row][col] > rainfall) {
					rainfall=monthlyRainfall[row][col];
				}
			}
		}
		
		return rainfall;
	}
	
	// returns the total amount in mm of rain that fell all year
	public static int returnTotalYearRainfall(int[][] monthlyRainfall) {
		// count to keep track of each days rainfall
		int total = 0;
		/// nested for loop to ietrate through arrays
		for (int row = 0; row < monthlyRainfall.length; row++) {
			for (int col = 0; col < monthlyRainfall[row].length; col++) {
				total+=monthlyRainfall[row][col];
			}
		}
		// returns int of total rainfall
		return total;
	}
	
	
	// method that works out hwo many days had rain in each month
	public static int[] returnTotalRainDaysPerMonth(int[][] monthlyRainfall, String[]months) {
		
		// new array to store the total number of rain days for each month
		int[] rainDays = new int[months.length];
		
		
		for (int row = 0; row < monthlyRainfall.length; row++) {
			for (int col = 0; col < monthlyRainfall[row].length; col++) {
				if (monthlyRainfall[row][col] > 0) {
					rainDays[row]+=1;
				}
				
				
				
			}
		}
		
		return rainDays;
	}
	
	// method that returns the month with the highest rainfall
	public static int returnHighestRainMonth (int[][]monthlyRainfall, String[]months) {
		
		int mostRain = 0;
		
		int mostRainIndex = 0;
		
		// for loop that iterates through array passed from the method below and works out the index of the highest number 
		for (int i = 0; i < returnTotalRainDaysPerMonth(monthlyRainfall, months).length; i++) {
			if (returnTotalRainDaysPerMonth(monthlyRainfall, months)[i] > mostRain) {
				mostRain = returnTotalRainDaysPerMonth(monthlyRainfall, months)[i];
				// applies the index of the month with the most rain to an int variable 
				mostRainIndex = i;
			}
		}
		// returns index of the month with the most rain 
		return mostRainIndex;
	}
	
	// method that translates each row index from the main array of data to a String from the month array using a number passed as a parameter
	public static String monthIndex(int[][]monthlyRainfall, String[]months, int i) {
		
		String month = "";
		
		for (int row = 0; row < monthlyRainfall.length; row++) {
			if (monthlyRainfall[row]==monthlyRainfall[i]) {
				month=months[i];
		
			}
		}
		
		return month;
	}
	
	
	public static void displayVisualRainfallStats(int[][]monthlyRainfall, String[]months) {
		
		// nested for loop to loop through data
		for (int month = 0; month < monthlyRainfall.length; month++) {
			// prints month at begining of dataset
			System.out.print(months[month]+"\t");
			// sorts each month array into ascending order
			Arrays.sort(monthlyRainfall[month]);
			// loops through each day and only prints it if rainfall is above zero
			for (int day = 0; day < monthlyRainfall[month].length; day++) {
				if (monthlyRainfall[month][day] != 0) {
					System.out.printf("%-4d", monthlyRainfall[month][day]);
					
				}
			}
			// line break after each month
			System.out.println();
		}
	}
	
	

	
	
}



