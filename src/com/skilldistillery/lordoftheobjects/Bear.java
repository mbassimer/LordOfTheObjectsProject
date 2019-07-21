package com.skilldistillery.lordoftheobjects;

public class Bear extends Participant {

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(double healthPts, String name, String origin) {
		super(healthPts, name, origin);
	}

	
	public void damagePts(Participant hunter) {

		double damagePts = (Math.random() * 5 + 1);
		hunter.healthPts -= (int)damagePts;
		System.out.println(hunter.name +" health is knocked down to: " + (int)hunter.healthPts);

	}
	

}
