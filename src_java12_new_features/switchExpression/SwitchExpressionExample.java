package switchExpression;

import java.util.Scanner;

public class SwitchExpressionExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the day of the week: ");
		String next = input.nextLine();
		input.close();
		String result1;
		switch (next.toLowerCase()) {
		case "monday", "tuesday", "wednesday", "thursday", "friday":
			result1 = "Workday :|";
			break;
		case "saturday":
			result1 = "Ice cream day \\o/";
			break;
		case "sunday":
			result1 = "Relax day! :)";
			break;
		default:
			result1 = "Invalid Input! :(";
			break;
		}
		System.out.println("Result 1: " + result1);
		
		// ============= with java 12 =============
		
		var result2 = switch (next.toLowerCase()) {
		case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Workday :|";
		case "saturday" -> "Ice cream day \\o/";
		case "sunday" -> "Relax day! :)";
		default -> "Invalid Input! :(";
		};
		System.out.println("Result 2: " + result2);
	}
	
}
