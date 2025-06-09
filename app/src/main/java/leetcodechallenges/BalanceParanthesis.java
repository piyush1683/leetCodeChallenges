package leetcodechallenges;

public class BalanceParanthesis {

    public static void main(String[] args) {
        String str = "((()))";
        boolean result = isBalanced(str);
        if (result) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }

    public static boolean isBalanced(String str) {
        int balance = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            // If balance goes negative, we have more closing than opening
            if (balance < 0) {
                return false;
            }
        }
        // If balance is zero, parentheses are balanced
        return balance == 0;
    }

}
