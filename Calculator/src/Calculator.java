import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
				
		if (input.contains("+") == true) {
			int index = input.indexOf('+');
			String substringOne = input.substring(0, index);
			String substringTwo = input.substring(index+1);
			System.out.println(output(substringOne, substringTwo, '+'));
		}
		else if (input.contains("-") == true) {
			int index = input.indexOf('-');
			String substringOne = input.substring(0,index);
			String substringTwo = input.substring(index+1);
			System.out.println(output(substringOne, substringTwo, '-'));

		}
		else if (input.contains("*") == true) {
			int index = input.indexOf('*');
			String substringOne = input.substring(0,index);
			String substringTwo = input.substring(index+1);
			System.out.println(output(substringOne, substringTwo, '*'));

		}
		else {
			int index = input.indexOf('/');
			String substringOne = input.substring(0,index);
			String substringTwo = input.substring(index+1);
			System.out.println(output(substringOne, substringTwo, '/'));

		}
	}
	
	public static int output(String str1, String str2, char operator) {
		int input1 = Integer.parseInt(str1);
		int input2 = Integer.parseInt(str2);
		int result = 0;
		switch (operator) {
		case '+': result = input1 + input2;
			break;
		case '-': result = input1 - input2;
			break;
		case '*': result = input1 * input2;
			break;
		case '/': result = input1 / input2;
		}
		return result;
	}
	

}