package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		LordOfTheObjectsApp game = new LordOfTheObjectsApp();
		int play;
		boolean replay = true;
		do {
			introGraphic();
			play = kb.nextInt();
			if (play == 1) {
				game.run();
			}
			if (play != 1) {
				replay = false;
				System.out.println("Goodbye!");
			}

		} while (replay);

	}

	private void run() {

		System.out.println("Welcome Hunter! What is your first name?");
		String playerName = kb.next();

		System.out.println("Where are you from?");
		String origin = kb.next();

		Hunter player = new Hunter(200, "", "");
		player.name = playerName;
		player.origin = origin;

		System.out.println("Welcome " + player.name.toUpperCase() + " from " + player.origin.toUpperCase() + ".");
		System.out.println("Your health is: " + player.getHealth() + "\n");

		Bear enemy1 = new Bear(25, "Grizzly", "Amazonian");
		System.out.println("Let's go hunting!\nYou're walking through the Object Forest and hear a noise...");
		System.out.println("Crikey!!!! It's an " + enemy1.origin + " " + enemy1.name + "!");

		boolean alive = true;

		do {
			player.hunterAttack(kb);
			player.damagePts(enemy1);
			enemy1.damagePts(player);

			if (player.healthPts < 0 || enemy1.healthPts < 0) {
				alive = false;
			}
		} while (alive);

		if (player.healthPts <= 0) {
			System.out.println("You died.");
			System.out.println("You died. Play again (Y or N)?");
			String answer = kb.next();
			switch (answer) {
			case "y":
			case "Y":
				run();
				break;
			case "n":
			case "N":
				System.exit(0);
			}
		}
		if (enemy1.healthPts <= 0) {
			System.out.println("Must notify Department of Natural Resources the " + enemy1.name + " died.");
		}

		Lion enemy2 = new Lion(50, "Lion", "Antarctic");
		System.out.println("\nPhew...that was close. Let's keep moving.");
		System.out.println(
				"\nYou hear a loud ROAR...\nThat looks like an " + enemy2.origin + " " + enemy2.name + " seriously???");

		alive = true;
		do {
			player.hunterAttack(kb);
			player.damagePts(enemy2);
			enemy1.damagePts(player);

			if (player.healthPts < 0 || enemy2.healthPts < 0) {
				alive = false;
			}
		} while (alive);

		if (player.healthPts <= 0) {
			System.out.println("You died. Play again (Y or N)?");
			String answer = kb.next();
			switch (answer) {
			case "y":
			case "Y":
				run();
				break;
			case "n":
			case "N":
				System.exit(0);
			}
		}
		if (enemy2.healthPts <= 0) {
			System.out.println("\nMust notify Department of Natural Resources the " + enemy2.name + " died.");
		}

		Gorilla enemy3 = new Gorilla(75, "Gorilla", "Californian");
		System.out.println("\nHow did you survive that?? You've almost reached your target");
		System.out.println("\nYou've got to be kidding me...what was that ungodly noise??");
		System.out.println("It definitely sounded like a " + enemy3.origin + " " + enemy3.name + ". Yikes!");

		alive = true;
		do {
			player.hunterAttack(kb);
			player.damagePts(enemy3);
			enemy3.damagePts(player);

			if (player.healthPts < 0 || enemy3.healthPts < 0) {
				alive = false;
			}
		} while (alive);

		if (player.healthPts <= 0) {
			System.out.println("You died. Play again (Y or N)?");
			String answer = kb.next();
			switch (answer) {
			case "y":
			case "Y":
				run();
				break;
			case "n":
			case "N":
				System.exit(0);
			}
		}
		if (enemy3.healthPts <= 0) {
			System.out.println("\nMust notify Department of Natural Resources the  " + enemy3.name + "  died.");
			System.out.println("You have reached your target! You find a deer object and take it home for dinner!");

		}

	}

	public static void introGraphic() {
		System.out.println("**************************************");
		System.out.println("*       Hunter Of The Objects        *");
		System.out.println("*                                    *");
		System.out.println("*  Do you want to go hunting today?  *");
		System.out.println("*                                    *");
		System.out.println("*         1) Yes! Play Game          *");
		System.out.println("*         2) No! Quit                *");
		System.out.println("*                                    *");
		System.out.println("**************************************");
	}

}
