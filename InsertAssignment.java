import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertAssignment {
	private static final int stot = 0;
	private static final int sgrd = 0;
	private static final String birthdate = null;

	public static void main(String[] args) {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO STUDENT1 VALUES (?,?,?,?,?,?,?,?);");
			System.out.println("Prepared Statement created : "+pst);
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter student rollnumber : ");
			int sno = scan1.nextInt();
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter student name   : ");
			String sname = scan2.next();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter birthdate : ");
			String sbd = scan3.next();
			Date date = Date.valueOf(sbd);
	
			
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter physics marks : ");
			int sphy = scan4.nextInt();
			
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Enter chemistry marks : ");
			int scem = scan5.nextInt();
			
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Enter maths marks : ");
			int smath  = scan6.nextInt();
			
		    int tot=sphy+smath+scem;
		    
			Scanner scan7 = new Scanner(System.in);
			System.out.println("Enter student grade   : ");
			String sgrade = scan2.next();
			
			
			
			pst.setInt(1, sno);//fill up the question mark with its value
			pst.setString(2, sname);
			pst.setDate(3, date);
			pst.setInt(4, sphy);//fill up the question mark with its value
			pst.setInt(5, scem);
			pst.setInt(6, smath);
			pst.setInt(7, tot);
			pst.setString(8, sgrade);
			
			System.out.println("Trying to execute the prepared statement....");
			
			int rows = pst.executeUpdate();
			
			System.out.println("Prepred Statement executed, inserted the records :..."+rows);
				
			
			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}