//Write a program to print the addition of two numbers

import java.util.Scanner;

public class Addtwonumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first ans second number");
		int numberone = input.nextInt();
		int numbersecond = input.nextInt();
		System.out.println("addition " + (numberone + numbersecond));
	}
}
