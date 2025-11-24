//write a program to swap of two number using third variable

import java.util.Scanner;

public class SwapUsigThirdVar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int numberfirst = input.nextInt();
		System.out.println("Enter the second number ");
		int secondnumber = input.nextInt();
		
		if(numberfirst > 0 && secondnumber > 0) {
			int temp = numberfirst;
			numberfirst = secondnumber;
			secondnumber = temp;
		}
		System.out.println("the first number is now " + numberfirst + " and " + "second number is " + secondnumber);
	}

}
