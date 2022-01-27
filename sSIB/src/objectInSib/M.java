package objectInSib;

public class M {  //OUTPUT: IIB SIB IIB From Main
	{
		System.out.println("IIB");
	}
	static {
		new M();
		System.out.println("SIB");
new M();

	}
	public static void main(String[] args) {
		System.out.println(("From Mian"));
	}
}

//First SIB
//enter the object , IIB is called
//SIB is called and prints SIB
//Again object is present then IIB is called 
// Control goes to main and main is executed From Main 