package sSIB1;
//SIB runs before main method and does not require any invoking statement 
//Example is shown below//
public class A {
static 
{
	System.out.println("From SIB");
	
}
public static void main(String[] args) {
	System.out.println("From Main"); // First SIB and Then Main method//
}
}
