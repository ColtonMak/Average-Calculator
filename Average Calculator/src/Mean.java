import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		// Opens scanner
		Scanner sc = new Scanner (System.in);
		// Tells user what to do
		System.out.println("This is a java program accepts inputted numbers and calculates the average.");
		System.out.println("Make sure your inputted numbers have spaces between them.");
		System.out.println("Enter your numbers");
		// Takes user input
		String input = sc.nextLine();
		sc.close();
		
		//splits string into an array
		String[] parts = input.split(" ");
		double total = 0;
		//finds sum of all elements in array
		for (String x : parts) {
			double inputDouble = Double.parseDouble(x);
			total += inputDouble;
		}
		//finds average and prints it to console
		double average = total / parts.length;
		System.out.println("The average of the inputted numbers is: " + average);
	}

}
