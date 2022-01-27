package factorialNumber;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner newScan = new Scanner(System.in);
		System.out.println("Enter the number> ");
	long num = newScan.nextLong();
	long i;
	long fact=1;
	for (i = 1; i<=num; i++) {
		fact = fact *i;
		
	}
	System.out.println("Factorial is: "+fact);
		newScan.close();
	}

}
