public class PassingObjectAndReturnigValueTest {


	public static void main(String[] args) {
		
		Flight.showKiteCount();
		
		Flight Flight1 = new Flight("AirAsia",50,"mohan",true);
		Flight Flight2 = new Flight("Emrites",60,"Sunil",true);
		Flight Flight3 = new Flight("Bluedart",70,"pavan",true);


		Flight.showflightCount();

	
		
		
	}

}



class Flight
{
	String color;
	int length;
	String owner;
	boolean flyingStatus;
	private static int flightCount1;
	
	private static int flightCount; 
	
	public static void showKiteCount() {
		try {
			System.out.println("Total kites in the sky : "+flightCount1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void showflightCount() {
		// TODO Auto-generated method stub
		
	}

	public Flight(String color, int length, String owner, boolean flyingStatus) {
		super();
		System.out.println("Flight constructed...");
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flyingStatus = flyingStatus;
		flightCount1++; //increment is as per the new kite 
	}

	void printKite() {
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Status : "+flyingStatus);	
		System.out.println("-------------------------------");
	}

	void kiteFight(Flight flightRef) {
		System.out.println(color+" kite initiated kite fight with "+flightRef.color+" color kite ");
	}
	
	void kiteFight(Flight flightRef1, Flight flightRef2) {
		System.out.println(color+" kite initiated kite fight with "+flightRef1.color+" color kite and "+flightRef2.color+" color Flight");
	}

}

