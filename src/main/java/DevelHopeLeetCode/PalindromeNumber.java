public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to its reversed version
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121; // Example number
        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
    }
}
