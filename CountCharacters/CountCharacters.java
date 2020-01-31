package CountCharacters;

// A program that will count the number of occurrences
// of a particular letter in a given string.

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();
        String input = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = input.charAt(0);
            if (ch >= 'a' && ch <= 'm') ch += 13;
                else if (ch >= 'A' && ch <= 'M') ch += 13;
                else if (ch >= 'n' && ch <= 'z') ch -= 13;
                else if (ch >= 'N' && ch <= 'Z') ch -= 13;
            System.out.print(ch);
            System.out.println("Decoded message: ");
            System.out.println("--- --- --- --- ---");
            System.out.println(ch);
        }
    }
}