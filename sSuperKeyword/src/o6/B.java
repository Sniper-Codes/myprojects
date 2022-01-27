package o6;

// Constructors never get inherited
// OUTPUT is A B
public class B extends A {
	B(){
		System.out.println("B"); // Super keyword is  written first by the compiler hence NO Error
		
	}
	public static void main(String[] args) {
		new B(); 
	}

}


