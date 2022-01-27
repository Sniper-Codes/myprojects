package constructorArgs;
//If in te parent class there is only constructors with args>
//>then as a programmer we should explicitly write super keyword in child class constructor
public class D extends C{
D(){
	super(100); // placed explicitly by programmer 
	System.out.println("B");
}
public static void main(String[] args) {
	new D();
}
}

//Super and This keyword can be used together but should be used in one line as 2 statements
//We cannot use this and super keyword in the same constructor to call another constrcutor aseither of fthe statements second statemnets then 
//you will get an error as shown below 

// pubic class D extends C{
//D(){
	
//}
//D (int i){
	//this(); super(); // Error 
	
//}
//psvm(){
	//new D(100);
//}
// This keyword is not placed automatically 
// If your child constructor consists of this keyword then in that constructor super keyword will not be 
// automatically placed
// JVM is surrounded with Rules that is why we have to foll ow rules