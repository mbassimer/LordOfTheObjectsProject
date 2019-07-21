package com.skilldistillery.lordoftheobjects;

public class Participant {

	protected double healthPts;
	protected String name;
	protected String origin;

	public Participant() {
	}

	public Participant(double healthPts, String name, String origin) {
		this.healthPts = healthPts;
		this.name = name;
		this.origin = origin;
	}

	public double battle() {
		double winner = 0;
		return winner;
	}

	public double takeDamage() {
		double dmg = 0;
		return dmg;
	}

	

	public double getHealth() {
		return healthPts; 
	}

	public void setHealth(double health) {
		this.healthPts = health;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
