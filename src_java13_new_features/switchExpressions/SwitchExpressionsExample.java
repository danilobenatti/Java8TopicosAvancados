package switchExpressions;

import java.util.Scanner;

public class SwitchExpressionsExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the day of the week: ");
		String next = input.nextLine();
		input.close();
		
		String result = switch (next.toLowerCase()) {
		case "monday", "tuesday", "wednesday", "thursday", "friday":
			yield "Workday :|";
		case "saturday":
			yield "Ice cream day \\o/";
		case "sunday":
			yield "Relax day! :)";
		default:
			yield "Invalid Input! :(";
		};
		
		System.out.println("Result: " + result);
		
	}
	
}
