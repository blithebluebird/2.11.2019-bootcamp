import java.util.Scanner;

public class DayOfWeek2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the day of the week (as a number): ");
		int userInteger = sc.nextInt();

		if (userInteger == 1) {
			System.out.println("It is Monday.");
		} else {
			if (userInteger == 2) {
				System.out.println("It is Tuesday.");
			} else {
				if (userInteger == 3) {
					System.out.println("It is Wednesday.");
				} else {
					if (userInteger == 4) {
						System.out.println("It is Thursday.");
					} else {
						if (userInteger == 5) {
							System.out.println("It is Friday.");
						} else {
							if (userInteger == 6) {
								System.out.println("It is Saturday.");
							} else {
								if (userInteger == 7) {
									System.out.println("It is Sunday.");
								} else {
									if ((userInteger < 1) || (userInteger > 7)) {
										System.out.println("There is no such day.");
									}
								}
							}
						}
					}
				}
			}

		}

		sc.close();

	}

}
