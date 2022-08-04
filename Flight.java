
public class Flight {
  private int FlightNo;
  private String FlightName;
  private double TicketCost;
  private String Destination;
  private String Boarding;
public Flight(int flightNo, String flightName, double ticketCost, String destination, String boarding) {
	super();
	FlightNo = flightNo;
	FlightName = flightName;
	TicketCost = ticketCost;
	Destination = destination;
	Boarding = boarding;
}
public Flight(int flightNo) {
	super();
	FlightNo = flightNo;
}
public Flight(String flightName, double ticketCost) {
	super();
	FlightName = flightName;
	TicketCost = ticketCost;
}
public Flight(String destination, String boarding) {
	super();
	Destination = destination;
	Boarding = boarding;
}
public Flight(int flightNo, double ticketCost) {
	super();
	FlightNo = flightNo;
	TicketCost = ticketCost;
}
public Flight(String boarding) {
	super();
	Boarding = boarding;
}

  
  
   
}
