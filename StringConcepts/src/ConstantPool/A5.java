package ConstantPool;
// The area where these immutable objects have been created that area is called is String constant pool
// Write a program to convert integer to string. Refer below example
public class A5 {
	public static void main(String[] args) {
		int i=10;
		float f= 10.3F;
		boolean bool = true;
		char[] c = {'a','b','c'};
		String str = String.valueOf(i);
		String st = String.valueOf(f);
		String strn = String.valueOf(bool);
		String stg = String.valueOf(c);
		System.out.println(str);
		System.out.println(st);
		System.out.println(strn);
		System.out.println(stg);
	}

}

// Value of method converts given type such as int,long,float,double,boolean and char array 
//> to string