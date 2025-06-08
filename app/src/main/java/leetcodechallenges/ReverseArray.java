package leetcodechallenges;

public class ReverseArray {
    public static void main(String[] args) {
        // Create a character array
        char[] charArray = { 'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd', ' ', 'p', 'i', 'y', 'u', 's', 'h' };

        // Print the original character array
        System.out.println("Original character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Reverse the character array
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        // Print the reversed character array
        System.out.println("Reversed character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
