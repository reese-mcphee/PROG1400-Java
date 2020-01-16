package Cookies;

import java.util.Scanner;

public class Cookies {

    //  A bag of cookies holds 40 cookies.
    //  The calorie information on the bag claims
    // that there are 10 servings in a bag and
    // that each serving is 300 calories.
    // Write a program that lets the user enter the
    // number of cookies they ate and output how
    // many servings and calories it was.

    public static void main(String[] args) {

        int cookiesInBag = 40;
        int servingsInABag = 10;
        int servingCalories = 300;

        Scanner s = new Scanner(System.in);

        // user enters name
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        // user enters number of cookies eaten
        System.out.print("How many cookies did you eat? ");
        int numCookies = s.nextInt();

        // serving size
        int servingSize = cookiesInBag / servingsInABag;
        //                  Java determines the answer starting from
        //                  the left, and so will apply (float) to both
        //                  variables.
        float userServings = (float)numCookies / servingSize;

        float userCalories = userServings * servingCalories;

        System.out.println(
                    name + ", you ate " +
                    userCalories + " calories."
        );

    }
}