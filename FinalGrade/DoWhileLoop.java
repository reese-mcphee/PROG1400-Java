package FinalGrade;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        // grade variables
        float assignment;

        Scanner s = new Scanner(System.in);

        // loop 6 times to get all assignment grades
        float finalGrade = 0.0f;
        float lowest = 100.0f;
        int i = 0;
        do {
            System.out.print("Enter grade for assignment " + (i+1) + " (-1 to end): ");
            assignment = s.nextFloat();

            if (assignment >= 0.0f ) {
                finalGrade += assignment;

                if (assignment < lowest) {
                    lowest = assignment;
                }
            }

            //i = i + 1;
            //i += 1;
            i++;
        } while (assignment >= 0.0f);
        // System.out.println("i = " + i); -- debug code
        finalGrade -= lowest;
        // subtracting 2 to account for lowest grade and -1 loop
        finalGrade /= (i-2);

        System.out.println("Your final grade is: " + finalGrade);
    }
}