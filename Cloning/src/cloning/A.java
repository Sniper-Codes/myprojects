package cloning;
//Cloning is an interface
//Throws compile time Exception and surround it with the Try catch block
//The process 0f creating replica of a particular object by copying the content of one object completely into another
//Object
public class A implements Cloneable{
public static void main(String[] args) {
	A a1= new A();
	try {
		A a2 =(A)a1.clone();
		System.out.println(a1);
		System.out.println(a2);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
}
}
