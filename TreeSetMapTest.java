package com.practice.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetMapTest {

	public static void main(String[] args) {
		Map<Integer, Car> c=new TreeMap<Integer, Car>();
		Car c1=new Car(120000, "Critea", "Hundai");
		Car c2=new Car(1550000, "Wargnor", "Suziki");
		Car c3=new Car(32000, "Alto", "Honda");
		
		c.put(101, c1);
		c.put(102, c2);
		c.put(103, c3);
		for(Map.Entry<Integer, Car> entry: c.entrySet()) {
			Car mn=entry.getValue();
			System.out.println(mn.price+" "+mn.name+" "+mn.manufacturer);
		}
	}

}
class Car{
	int price;
	String name;
	String manufacturer;
	//public Car(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	
	public  Car(int price, String name, String manufacturer) {
		super();
		this.price = price;
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	
}