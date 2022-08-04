
	public class ThreadTest {
		public static void main(String[] args) {
			//1. extend from java.lang.Thread class
			//2. override public void run()  method
			//3. create the object of your sub class
			//4. invoke the start() method of it, which would 
			// execute the run() method of it
			
			Aeroplane a1 = new Aeroplane("airAsia"); //3
			Aeroplane a2 = new Aeroplane("\tIndigo"); //3
			Aeroplane a3 = new Aeroplane("\t\tEmrites"); //3
			Aeroplane a4 = new Aeroplane("\t\t\tBluedart"); //3

			a1.start();
			a2.start();
			a3.start();
			a4.start();
			
			
		}
	}

	class Aeroplane extends Thread //1
	{
		String msg;
		
		Aeroplane(String m) {
			msg = m;
		}
		
		public void run() { //2. overriridng is always optional
			for (int i = 1; i < 100; i++) {
				System.out.println(msg+ " "+i);
			}
		}
	}

