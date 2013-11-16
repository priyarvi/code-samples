package com.examples;

public class Bicycle{
	
	int cadence=0;
	int speed =0;
	int gears=1;
	
	void changeCadence(int newValue){
		cadence = newValue;
	}
	void changeGears(int newGear){
		gears = newGear;
	}
	void speedUp(int increment){
		speed = speed+increment;
	}
	void speedDown(int decrement){
		speed = speed-decrement;
	}
	
	void print(){
		System.out.println("CADENCE: "+ cadence + " SPEED: " + speed + " GEAR: " + gears);
	    print();
	}
	
	public static void main(String[] args){
		Bicycle bike = new Bicycle();
		
		bike.changeCadence(5);
		bike.changeGears(4);
		bike.speedUp(10);
		bike.print();
		bike.speedDown(2);
		bike.print();
		
	}
}