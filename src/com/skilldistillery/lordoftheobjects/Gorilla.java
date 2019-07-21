package com.skilldistillery.lordoftheobjects;

public class Gorilla extends Enemy {

	public Gorilla() {
		super();
	}
	public Gorilla(double healthPts, String name, String origin) {
		super(healthPts, name, origin);
		
	}
	
	public void damagePts(Participant hunter) {

		double damagePts = (Math.random() * 20 + 1);
		hunter.healthPts -= (int)damagePts;
		System.out.println(hunter.name + "health is down to: " + (int)hunter.healthPts );

	}
	
	


}
