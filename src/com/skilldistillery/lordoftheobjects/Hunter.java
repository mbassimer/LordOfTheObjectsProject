package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Hunter extends Participant {

	public Hunter() {
		super();

	}

	public Hunter(double healthPts, String name, String origin) {
		super(healthPts, name, origin);
	};

	public void hunterAttack(Scanner kb) {
		System.out.println("What attack should I use?");
		System.out.println("Attack #1: Shotgun blast");
		System.out.println("Attack #2: Dynamite throw");
		System.out.println("Attack #3: Throw a trap snare");

		double hunterAttack = kb.nextDouble();

		while (hunterAttack < 0 || hunterAttack > 3) {
			System.out.println("I'm sorry I don't know how to respond");

			System.out.println("What attack should I use?");
			System.out.println("Attack #1: Shotgun blast");
			System.out.println("Attack #2: Dynamite throw");
			System.out.println("Attack #3: Throw a trap snare");
			hunterAttack = kb.nextDouble();
		}

		if (hunterAttack == 1) {
			System.out.println("Bang!!");

		}

		else if (hunterAttack == 2) {
			System.out.println("The hurt you are about to feel is real!!");

		}

		else if (hunterAttack == 3) {
			System.out.println("There's a way to get traped, and you're in it!!");

		}

		else {
			System.out.println("Dingo Babies!");
		}

	}

	public void damagePts(Participant target) {

		double damagePts = (Math.random() * 20 + 1);
		target.healthPts -= (int)damagePts;
		System.out.println(target.name + "health is down to: " + target.healthPts );

	}
	


}
