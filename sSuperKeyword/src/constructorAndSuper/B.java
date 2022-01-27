package constructorAndSuper;

// Constructors never get inherited

public class B extends A {
	B(){
		System.out.println("B"); // Super keyword is not written first hence Error
		super(); // Always make first priority to super keyword , this case is only with constructors
		
	}
	public static void main(String[] args) {
		new B(); // Object creation is mandatory otherwise program will not work
	}

}


// If we dont give super keyword inside child class constructor then compiler will automatically place super keyword
//Such that it can call only no args constructor of parent class