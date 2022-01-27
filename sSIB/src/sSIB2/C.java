package sSIB2; 
//We cannot initialize non static variables inside SIB//
public class C {
	int i;
	static {
		//i = 20; 
		//System.out.println(i); // Error
	}
	public static void main(String[] args) {
		C c1 = new C(); // We can create object inside SIB
	}

}
