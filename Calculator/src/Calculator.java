import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int operatorCount = charCounter(input, "+") + charCounter(input, "-") + charCounter(input, "*") + charCounter(input, "/");
		int j=0;
		input = input + "+";
		
		String[] inputArr = new String[operatorCount*2+1];
		for (int i=0; i<inputArr.length; i++) {
			String temp = Character.toString(input.charAt(j));
			j++;
			while (input.charAt(j-1) != '+' && input.charAt(j-1) != '-' && input.charAt(j-1) != '*' && input.charAt(j-1) != '/' && input.charAt(j) != '+' && input.charAt(j) != '-' && input.charAt(j) != '*' && input.charAt(j) != '/') {
				temp = temp + Character.toString(input.charAt(j));
				j++;
			}
			inputArr[i] = temp;
		}

		inputArr = operator(inputArr, "*");
		inputArr = operator(inputArr, "/");
		inputArr = operator(inputArr, "+");
		inputArr = operator(inputArr, "-");

		System.out.println(inputArr[0]);
	}
	
	public static void arrTester(String[] arr, String arrName) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arrName + " array, index " + i + ": " + arr[i]);
		}
	}
	
	public static int charCounter(String input, String ch) {
		int count = input.length() - input.replace(ch, "").length();
		return count;
	}
	
	public static String[] operator(String[] arr, String operator) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i].equals(operator)) {
				double numOne = Double.parseDouble(arr[i-1]);
				double numTwo = Double.parseDouble(arr[i+1]);
				switch (operator) {
				case "*":
					arr[i-1] = String.valueOf(numOne * numTwo);
					break;
				case "/":
					arr[i-1] = String.valueOf(numOne / numTwo);
					break;
				case "+":
					arr[i-1] = String.valueOf(numOne + numTwo);
					break;
				case "-":
					arr[i-1] = String.valueOf(numOne - numTwo);
					break;
				}
				arr = ArrayUtils.remove(arr, i);
				arr = ArrayUtils.remove(arr, i);
			}
		}
		return arr;
	}
}
