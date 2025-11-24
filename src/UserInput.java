
// taking user input

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = input.nextInt();
		System.out.println("Enter a string ");
		String name = input.next();
		System.out.println("Enter a float number ");
		float f1 = input.nextFloat();
		System.out.println("Name " + name);
		System.out.println("float number " +  f1);
		System.out.println("Integer number " + number);
	}

}
