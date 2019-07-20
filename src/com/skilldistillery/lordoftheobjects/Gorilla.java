package com.skilldistillery.lordoftheobjects;

public class Gorilla extends Participant {

	public Gorilla() {
		super();
	}
	public Gorilla(double healthPts, String name, String origin) {
		super(healthPts, name, origin);
		
	}
	
	public void damagePts(Hunter target) {

		double damagePts = (Math.random() * 20 + 1);
		target.healthPts -= (int)damagePts;
		System.out.println(target.name + "health is down to: " + target.healthPts );

	}
	
	


}
