package leetcodechallenges;

import java.util.HashSet;
import java.util.List;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String str = "paul and piyush and he is a good engineer";
        char result = firstNonRepeatedChar(str);
        char result1 = firstRepeatedChar(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        if (result1 != '\0') {
            System.out.println("The first repeated character is: " + result1);
        } else {
            System.out.println("No repeated character found.");
        }
    }

    public static char firstNonRepeatedChar(String str) {
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .toList();

        HashSet<Character> seen = new HashSet<>();
        for (char c : charList) {
            if (seen.add(c)) {
                continue;
            } else {
                return c;
            }
        }
        return '\0';// Return null character if no non-repeated character is found
    }

    public static char firstRepeatedChar(String str) {
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .toList();

        HashSet<Character> seen = new HashSet<>();
        seen.addAll(charList);
        for (char c : charList) {
            if (seen.contains(c)) {
                System.out.println(c + " is already in the set");
                return c; // Return the first repeated character
            } else {
                seen.add(c);
            }
        }
        return '\0'; // Return null character if no non-repeated character is found
    }
}
