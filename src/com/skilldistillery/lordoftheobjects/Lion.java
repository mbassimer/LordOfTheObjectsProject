package com.skilldistillery.lordoftheobjects;

public class Lion extends Participant {

	public Lion() {
		super();
	}

	public Lion(double healthPts, String name, String origin) {
		super(healthPts, name, origin);
		
	}

	
	public void damagePts(Participant hunter) {

		double damagePts = (Math.random() * 10 + 1);
		hunter.healthPts -= (int)damagePts;
		System.out.println(hunter.name.toUpperCase() + " health is knocked down to: " + hunter.healthPts);

	}
	
	
	
	
}
