package constructorArgs;

// Constructors never get inherited
// OUTPUT is A 100
public class B extends A {
	B(int i){
		System.out.println(i); // Super keyword is  written first by the compiler hence NO Error
		
	}
	public static void main(String[] args) {
		new B(100); 
	}

}


