package factorialNumber;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number: ");
		double num= scan.nextDouble();
		int i = 1, fact =1;
		while (i<=num) {
			fact = fact *i;
			i++;
		}
		System.out.println("Factorial of an entered number is: " +fact);
		scan.close();
		
	}

}
