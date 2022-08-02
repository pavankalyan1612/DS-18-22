public class AbstractTest1 {
	public static void main(String[] args) {
		
			GeometricalShape gs ;
			
			Circle2 c  = new Circle2();
		
			Rectangle rect = new Rectangle();
			
			Hexagon hex = new Hexagon();
			
			c.draw();
			rect.draw();
			hex.draw();
		
	}
}
abstract class GeometricalShape 
{
	abstract void draw(); 
	abstract void calcArea();
	abstract void calcPerimeter();
}

class Hexagon extends GeometricalShape
{
	void draw() {
		System.out.println("Drawing a hexagon..");
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
}

class Circle2 extends GeometricalShape
{
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
}
class Square extends GeometricalShape
{
	int side;

	

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcPerimeter() {
		// TODO Auto-generated method stub
		
	}
	
	void draw() {
		System.out.println("Drawing a sqaure....");
	}
}

class Rectangle extends Square 
{
	int side2;
	/*
	void draw() {
		System.out.println("Drawing...a Rectangle...");
	}*/
}



	class Doctor
	{
		void diagnose() { 
		
		}
		void prescribe() { 
			
		}
	}

	class Surgeon extends Doctor
	{
		
		
		void doSurgery()
		{
			
		}
		void diagnose() { 
			
		}
		
	}
	class HeartSurgeon extends Surgeon
	{
		void doHeartSurgery() { 
			
		}
	}