package OOP.Doubles;

import java.util.Scanner;

public class DoublesGame {

    public void run() {

        // two dice for the doubles game
        Die die1 = new Die();
        Die die2 = new Die();

        // player starts with $100
        int money = 100;

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("The Game Begins!");
        do {
            // roll the dice
            die1.roll();
            die2.roll();

            System.out.print("You rolled a " + die1.value);
            System.out.println(" and a " + die2.value);

            // shot doubles!
            if (die1.value == die2.value) {
                System.out.println("You WIN!! ");
                money *= 2;
            } else {
                // lose $20, if not doubles
                System.out.println("You lose $20. ");
                money -= 20;
            }

            if (money > 0) {
                System.out.println("You now have $" + money);

                System.out.print("Play again? (y/n) ");
                input = scanner.nextLine();
            } else {
                System.out.println("You have lost all your money.");
                input = "n";
            }

        } while(input.equals("y"));
        System.out.println("The Game Ends...");
    }
}