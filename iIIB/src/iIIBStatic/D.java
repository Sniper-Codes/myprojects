package iIIBStatic;
// We can initialize static and non static both inside IIB//
public class D {
	static int i;
	{
		i = 10;
		System.out.println(i);
	}
	public static void main(String[] args) {
		//D d1 = new D();// for staic varable object creation is not necessary
	}

}
