
// Example of Thread, In spring boot thread happens to be automated

public class A extends Thread{ // Thread here is built-in class and has two methods = run() ,
	//start()
     @Override
 public void run() {                           // Thread-1
    for (int i =0; i<100; i++) {
    	System.out.println(("run"));
    }
     }
     public static void main(String[] args) { // Thread--2
    	 A  a1 = new A();
    	 a1.start();                         // Starts the thread
		for (int i = 0; i<100;i++) {
			System.out.println("main");
		}
	}
}

// There are two ways we can add threads