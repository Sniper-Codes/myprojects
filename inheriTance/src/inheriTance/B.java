package inheriTance;

public class B extends A {
	public void test2() {
		System.out.print("Adarsh");
	}
	public void test5() {
		System.out.print("Hi");
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test3();
		b1.test4();
		b1.test2();
		b1.test5();
	} 

}
