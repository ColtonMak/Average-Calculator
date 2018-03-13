import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intOne = sc.nextInt();
		char operator = sc.next().charAt(0);
		int intTwo = sc.nextInt();
		sc.close();
				
		if (operator == '+') {
			System.out.println(intOne + intTwo);
		}
		else if (operator == '-') {
			System.out.println(intOne - intTwo);

		}
		else if (operator == '*') {
			System.out.println(intOne * intTwo);

		}
		else {
			System.out.println(intOne / intTwo);

		}
	}
}