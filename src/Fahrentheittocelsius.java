
// Write a program to convert the fhrenheit to celsius

import java.util.Scanner;

public class Fahrentheittocelsius {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
		float temp = input.nextFloat();
		
		float celsius;
		celsius = ((temp -32)*5)/9;
		System.out.println("temperature in celsius " + celsius);
	}
}
