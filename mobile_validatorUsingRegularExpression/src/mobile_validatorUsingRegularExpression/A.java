package mobile_validatorUsingRegularExpression;

import java.util.Scanner;

//Mobile phone validator using regular expression 
public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mobile Number: ");
		String str = scan.next();
		String regex = "[6-9][0-9]{9}";//[6-9][0-9] {9} //Do not put a space, if loop doesnt work else statement
		//will be executed
	scan.close();
		if(str.matches(regex)) {
			System.out.println("valid");
			} else {
			System.out.println("Invalid");
		}
	}

}
//Another logic to write in regex is = "(0/91)?[7-9][0-9]{9}"