package basic.b3_controlFLow;

/*Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.*/
public class Palidrome {
    public static void main(String[] args) {
        int a = 3223;
        // Assuming isPalindrome() is a method that returns true or false
        System.out.println(isPalindrome(a) ? "Yes" : "No");
        System.out.println(isPalindromeNuber(a) ? "Yes" : "No");
        System.out.println(isPalindromeNuberAsString(a) ? "Yes" : "No");
    }

    // Example method that checks if a word is a palindrome
    private static boolean isPalindrome(int a) {
        // Your logic to determine if a palindrome or not
        // For simplicity, let's assume a fixed value for demonstration
        String word = "level";
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    private static boolean isPalindromeNuber(int a) {
        int sum = 0;
        int n = a;
        while (a > 0) {
            int rem = a % 10;
            sum = sum * 10 + rem;
            a=a/10;
        }
        return n == sum;
    }

    private static boolean isPalindromeNuberAsString(int a) {
        // Your logic to determine if a palindrome or not
        // For simplicity, let's assume a fixed value for demonstration
        String word = "level";
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }


}
