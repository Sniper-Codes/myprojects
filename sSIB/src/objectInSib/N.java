package objectInSib;

public class N {
	{
		System.out.println("From IIB");
		   new N();
		   
	}
	public static void main(String[] args) {
		N n1= new N();
		System.out.println("From Main");
	}
}




//Program will halt abruptly when we create object inside SIB, Error will not happen
//Refer above program for example