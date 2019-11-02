import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the day of the week (as a number): ");
		int userInteger = sc.nextInt();

		if (userInteger >= 1 && userInteger <= 7) {
			if (userInteger <= 5) {
				System.out.println("It is workday.");
			} else {
				System.out.println("It is weekend.");
			}
		} else {
			System.out.println("There is no such day.");
		}

		sc.close();

	}

}
