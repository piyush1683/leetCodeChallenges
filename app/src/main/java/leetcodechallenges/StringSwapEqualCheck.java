package leetcodechallenges;

import java.util.ArrayList;

public class StringSwapEqualCheck {
    public static void main(String[] args) {
        // Create two strings
        String str1 = "abc";
        String str2 = "cba";
        StringSwapEqualCheck stringSwapEqualCheck = new StringSwapEqualCheck();
        stringSwapEqualCheck.checkEqualString(str1, str2);

    }

    public boolean checkEqualString(String str1, String str2) {
        // Check if the two strings are equal
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
            return true;
        }

        if (str1.length() != str2.length()) {
            System.out.println("The strings are different objects in memory.");
            return false;
        }

        ArrayList<Character> charList1 = new ArrayList<>();
        ArrayList<Character> charList2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            }
            if (str1.charAt(i) != str2.charAt(i)) {
                charList1.add(str1.charAt(i));
                charList2.add(str2.charAt(i));
            }
        }

        if (charList1.size() > 2) {
            System.out.println("Piyush1 The strings cannot be made equal by swapping characters.");
            return false;
        } else if (charList1.size() == 2) {
            if (charList1.get(0) == charList2.get(1) && charList1.get(1) == charList2.get(0)) {
                System.out.println("Piyush2 The strings can be made equal by swapping characters.");
                return true;
            } else {
                System.out
                        .println("Piyush3 The strings cannot be made equal by swapping characters." + charList2.size());
                return false;
            }
        }
        return false;
    }
}