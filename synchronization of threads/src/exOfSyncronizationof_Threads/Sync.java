package exOfSyncronizationof_Threads;
//Only for Understanding purpose, will not be asked in Interviews.
public class Sync {
int balance = 0;
public static void main(String[] args) {
	Sync s1 = new Sync();
	s1.account();
	System.out.println(s1.balance);
}
public void account() {
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			add();
			
		}
	});
	Thread t2 = new Thread(new Runnable () {
		@Override
		public void run() {
			sub();
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (Exception e) {
		System.out.println(e);
	}
}
public synchronized void add() {
	for (int i =0; i<1000; i++) {
		balance = balance+i; 
	}
}
public synchronized void sub() {
	for (int i =0; i<1000; i++) {
		balance = balance-i;
	}
}
}