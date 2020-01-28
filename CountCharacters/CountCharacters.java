package CountCharacters;

// A program that will count the number of occurrences
// of a particular letter in a given string.

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        System.out.print("Enter a letter: ");
        String input = s.nextLine();
        char ch = input.charAt(0);

        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("There are " + count + " '" + ch + "'s in" + str);
    }

}