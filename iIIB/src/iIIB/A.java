package iIIB;
// IIB;s are executed when objects are created//
//Number of times we create object, same number of IIB are called//
//IIb's are used to initialize instance variables in one place an that gives us better readability of code//
public class A {
	{
		System.out.println("From IIB");
	}
	A(){
		System.out.println("From Constructor"); // Always when object is created IIB is called first and then constructor//
	}
	public static void main(String[] args) {
		System.out.println("Start Main"); //main method is executed first and then IIB and then Constructor is executed//
		// Object is not created hence no IIB is called//
		A a1 = new A(); // An Object is created hence IIB is called//
	//	A a2 = new A(); // Created once again hence again IIB are called//
		//Output = From IIB  From IIB //
		//Difference between an IIB and Constructor, IIB are always called first//
		System.out.println("From Main"); 
	}

}
// Program flow
//main method is executed first and then IIB and then Constructor is executed//