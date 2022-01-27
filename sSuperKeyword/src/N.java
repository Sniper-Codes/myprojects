
public class N extends M{
public static void main(String[] args) {
	N n1 = new N();
	n1.test();
}
public static void test() {
	System.out.println(super.i); // Error
}
}
//Using super keyword we can access static and non static members both
// Super keyword cannot be used inside static context. Example is given above
// Do not use super keyword inside main method as it is static method