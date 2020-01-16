package FinalGrade;

import java.util.Scanner;

public class FinalGrade{

        public static void main(String[] args) {

            // grade variables
            float assignment1;
            float assignment2;
            float assignment3;
            float assignment4;
            float assignment5;
            float assignment6;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter grade for Assignment 1: ");
            assignment1 = s.nextFloat();
            System.out.print("Enter grade for Assignment 2: ");
            assignment2 = s.nextFloat();
            System.out.print("Enter grade for Assignment 3: ");
            assignment3 = s.nextFloat();
            System.out.print("Enter grade for Assignment 4: ");
            assignment4 = s.nextFloat();
            System.out.print("Enter grade for Assignment 5: ");
            assignment5 = s.nextFloat();
            System.out.print("Enter grade for Assignment 6: ");
            assignment6 = s.nextFloat();

            // test if user chooses the optional assignment

            float finalGrade;

            if (assignment6 >= 0) {

                // if yes, determine lowest previous assignment
                // and replace it

                float lowestGrade = 100.0f;

                if (assignment1 > lowestGrade) {
                    lowestGrade = assignment1;
                }
                if (assignment2 > lowestGrade) {
                    lowestGrade = assignment2;
                }
                if (assignment3 > lowestGrade) {
                    lowestGrade = assignment3;
                }
                if (assignment4 > lowestGrade) {
                    lowestGrade = assignment4;
                }
                if (assignment5 > lowestGrade) {
                    lowestGrade = assignment5;
                }
                finalGrade = assignment6;
                    if (assignment1 != lowestGrade) {
                        finalGrade += assignment1;
                    }
                    if (assignment2 != lowestGrade) {
                        finalGrade += assignment2;
                    }
                    if (assignment3 != lowestGrade) {
                        finalGrade += assignment3;
                    }
                    if (assignment4 != lowestGrade) {
                        finalGrade += assignment4;
                    }
                    if (assignment5 != lowestGrade) {
                        // finalGrade = finalGrade + assignment5;
                        finalGrade += assignment5;
                    }
                    // finalGrade = finalGrade / 5.0f;
                    finalGrade /= 5.0f;

            } else {

                finalGrade =
                        (assignment1 + assignment2 + assignment3 +
                                assignment4 + assignment5 /* + assignment6 */) / 5;
                System.out.println("Your final grade is: " + finalGrade);
            }
        }
}