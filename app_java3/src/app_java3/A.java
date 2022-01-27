package app_java3;

public class A {
	static char c;
	public void test() {
		int x = 10;
		System.out.println(x);
	}
	char D;
	public int test1(int x) {
		System.out.println(x);
		return c;
		
	}
public static void main(String[] args) {
	A a1 = new A();
	A  a2 = new A();
	A a3 = new A();
	System.out.println(c);
	System.out.println(a3.D);
	a1.test();
	a2.test1(300);
}
}
