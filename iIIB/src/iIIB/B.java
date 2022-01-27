package iIIB;
//Multiple IIB//
public class B {
	

	{
		System.out.println("From IIB - 1");
	}
	{
     System.out.println("From IIB - 2");
}
	B(){
		System.out.println("From constructor");
	}
public static void main(String[] args) {
	B b1 = new B();
	System.out.println("From main");
}
}