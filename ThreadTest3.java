public class ThreadTest3 {
	public static void main(String[] args) {
		//1. extend from java.lang.Thread class
		//2. override public void run()  method
		//3. create the object of your sub class
		//4. invoke the start() method of it, which would 
		// execute the run() method of it
		
		MyMessage m1 = new MyMessage("ping"); //3
		MyMessage m2 = new MyMessage("\tpong"); //3
		MyMessage m3 = new MyMessage("\t\tpang"); //3
		MyMessage m4 = new MyMessage("\t\t\tpung"); //3

		System.out.println("current thread? : "+Thread.currentThread().getName());
		
		System.out.println("m1 : "+m1.getName());
		System.out.println("m2 : "+m2.getName());
		System.out.println("m3 : "+m3.getName());
		System.out.println("m4 : "+m4.getName());
		
		m1.setName("Ping Thread");
		m2.setName("Pong Thread");
		m3.setName("Pang Thread");
		m4.setName("Pung Thread");
		
		System.out.println("m1 : "+m1.getName());
		System.out.println("m2 : "+m2.getName());
		System.out.println("m3 : "+m3.getName());
		System.out.println("m4 : "+m4.getName());
		
		System.out.println("is thread1 alive : "+m1.isAlive());
		System.out.println("is thread2 alive : "+m2.isAlive());
		System.out.println("is thread3 alive : "+m3.isAlive());
		System.out.println("is thread4 alive : "+m4.isAlive());
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		System.out.println("==> after start <== ");
		System.out.println("==> is thread1 alive : "+m1.isAlive());
		System.out.println("==> is thread2 alive : "+m2.isAlive());
		System.out.println("==> is thread3 alive : "+m3.isAlive());
		System.out.println("==> is thread4 alive : "+m4.isAlive());
		
		try {
			m1.join(); //await for m1 to die
			m2.join(); //await for m2 to die
			m3.join(); // await for m3 to die
			m4.join(); // await for m4 to die
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("======> END OF MAIN <====== ");
		
	}
}

class MyMessage extends Thread //1
{
	String msg;
	
	MyMessage(String m) {
		msg = m;
	}
	
	public void run() { //2. overriridng is always optional
		for (int i = 1; i < 100; i++) {
			System.out.println(msg+ " "+i);
		}
	}
}