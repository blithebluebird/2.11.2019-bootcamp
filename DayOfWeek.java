import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the day of the week (as a number): ");
		int userInteger = sc.nextInt();
		
		if (userInteger == 1) {
			System.out.println("It is Monday.");
		}
		
		if (userInteger == 2) {
			System.out.println("It is Tuesday.");
		}
		
		if (userInteger == 3) {
			System.out.println("It is Wednesday.");
		}
		
		if (userInteger == 4) {
			System.out.println("It is Thursday.");
		}
		
		if (userInteger == 5) {
			System.out.println("It is Friday.");
		}
		
		if (userInteger == 6) {
			System.out.println("It is Saturday.");
		}
		
		if (userInteger == 7) {
			System.out.println("It is Sunday.");
		}
		
		if ((userInteger < 1) || (userInteger > 7)) {
			System.out.println("There is no such day.");
		}
		
		sc.close();

	}

}
