package leetcodechallenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

    public static void main(String[] args) {
        // Create a character array with duplicates
        char[] charArray = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 'p', 'i', 'y', 'u', 's', 'h' };
        Set<Character> charset = new HashSet<Character>();
        // Print the original character array
        System.out.println("Original character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
            charset.add(c);
        }
        System.out.println("Print the character array without duplicates:");
        // Convert the character array to a Set to remove duplicates
        charset.forEach(c -> System.out.print(c + " "));
    }
}
