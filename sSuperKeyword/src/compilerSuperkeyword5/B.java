package compilerSuperkeyword5;

public class B extends A {
B(){
}
public static void main(String[] args) {
	new B();
}
}

//Compiler automatically calls super keyword
// If you dont create child class constructor without arguement then compiler will automatically place
// no args constructor with super keyword

// public class B extends A
//psvm(){
//new B();
//} }