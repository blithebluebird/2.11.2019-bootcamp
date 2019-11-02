import java.util.Scanner;

public class Uzdevums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// We redo the previous exercise with name, age, pet from Monday into a new template
		
		System.out.println("Input your name: ");
		String userText = sc.next();
		
		System.out.println("Input your age: ");
		int userInteger = sc.nextInt();
		
		System.out.println("Do you have a pet ? ");
		boolean userBoolean = sc.nextBoolean();
		
		System.out.println("My name is " + userText);
		System.out.println("I am " + userInteger + " years old.");
		System.out.println("Do you have a pet ? " + userBoolean);
		
		sc.close();
	}

}
