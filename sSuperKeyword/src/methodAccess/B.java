package methodAccess;
// Using super keyword we can access static and non static members both
public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		
	}
	public void test () {
		super.xyz();
	}

}
