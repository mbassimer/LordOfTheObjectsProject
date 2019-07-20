package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        LordOfTheObjectsApp game = new LordOfTheObjectsApp();
        introGraphic();
        int play= kb.nextInt();
        if (play == 1) {
            game.run();
            
        }else 
        System.out.println("Goodbye!");
    }
    
    private void run() {
        
        System.out.print("Welcome Hunter, what is your name? " );
        String playerName = kb.next();
        System.out.print("Where are you from? ");
        String origin = kb.next();
        
        Hunter player = new Hunter(200, "",""); 
        player.name = playerName;
        player.origin = origin;
        
        System.out.println("Welcome " + player.name.toUpperCase()+ " from " + player.origin.toUpperCase() + ".");
        System.out.println("Your health is: " + player.getHealth());
        
        Bear enemy1 = new Bear(25, "Grizzly","Amazonian");
        System.out.println("Let's begin! You're walking through the woods and hear a noise");
        System.out.println("Crikey!!!! It's a " + enemy1.origin + " " + enemy1.name + "!");
        
        boolean alive = true;
        
        do {
        player.hunterAttack(kb);
        player.damagePts(enemy1);
        enemy1.damagePts(player);
        
        System.out.println(player.healthPts);
        System.out.println(enemy1.healthPts);
        
        if (player.healthPts < 0 || enemy1.healthPts < 0) {
            alive = false;
        }
        } while (alive);
        
        if (player.healthPts < 0) {
            System.out.println("You died.");
            System.exit(0);
        }
        
        Lion enemy2 = new Lion(50, "Lion", "Antarctic");
        System.out.println("\nPhew...that was close. Let's keep moving.");
        System.out.println("You hear a roar. Again...seriously??");
        
        
        
        
        
        
        kb.close();
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
