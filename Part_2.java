//public class try1_2 {}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Thread;

public class Part_2 {
	
	public static void main(String args[]) {

			int x;
			testThread t0 = new testThread(0);
			testThread t1 = new testThread(1);
			testThread t2 = new testThread(2);
			testThread t3 = new testThread(3);
			testThread t4 = new testThread(4);
			
			t0.start();
			t1.start();
			t2.start();
			t3.start();
			t4.start();

			while (true) {
			   try {
			      t1.join();
			      t2.join();
			      t3.join();
			      t4.join();
			      t0.join();			    
			      break;
			   } catch (InterruptedException e) {
			      e.printStackTrace();
			   }
			}

			System.out.println("All threads terminated");	


		}		
}


class Buffer {
	private int count;
	private boolean empty, full;
	public Buffer() {
		count = 0;
		empty = true;
		full = false;
	}
	public void put() {

	}
	public void get() {
	
	}
}


class TClassP {
	private Buffer b;

}


class TClassC {
	private Buffer b;	
}

class testThread extends Thread {
	int id;
	testThread(int start) { id = start; }
		public void run() {
			int i, value = id;
			for (i = 0; i < 10; i++){
				// “Hello, I am thread xx”
			System.out.println("Hello, I am thread " + id );
			value = value + 2;
		}
	}
}










// Write a Java program that has two classes: one named Main which includes
// ‘public static void main’ and another named TClass. TClass must be
// active – i.e. instances must each have their own thread of control. 