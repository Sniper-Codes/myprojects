package scannerNewproject1;

	import java.util.Scanner;

	public class newScan {
		public static void main(String[] args) {
			Scanner  scan = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = scan.next();
			System.out.println("Your name is : "+name);
			
			System.out.println("Enter your age: ");
			 float s2 = scan.nextFloat();
			System.out.println("Your age is : "+s2);
			
			
			System.out.println("Enter your weight: ");
			float weight = scan.nextFloat();
			System.out.println("Your weight is : "+ weight);
			
			
			scan.close();
			
			
		}

	}



