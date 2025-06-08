package leetcodechallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DeleteCharArray {
    public static void main(String[] args) {
        // Create a character array
        char[] charArray = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 'p', 'i', 'y', 'u', 's', 'h' };

        ArrayList<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        char deleteChar = 'e'; // Character to delete

        // Print the original character array
        charList.forEach(c -> System.out.println(c));

        charList.removeIf(c -> c == deleteChar);
        // Print the modified character array
        System.out.println("After deleting '" + deleteChar + "':");
        charList.forEach(c -> System.out.println(c));

    }
}