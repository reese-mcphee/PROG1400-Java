package FinalGrade;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // grade variables
        float assignment;

        Scanner s = new Scanner(System.in);

        // loop 6 times to get all assignment grades

        float finalGrade = 0.0f;
        float lowest = 100.0f;

        for (int i = 0; i<6; i++) {
            System.out.print("Enter grade for assignment " + (i+1) + ": ");
            assignment = s.nextFloat();
            finalGrade += assignment;

            if (assignment < lowest) {
                lowest = assignment;
            }
        }

        finalGrade -= lowest;
        finalGrade /= 5.0f;

        System.out.println("Your final grade is: " + finalGrade);
    }
}
//end code