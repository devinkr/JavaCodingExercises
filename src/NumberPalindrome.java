public class NumberPalindrome {

   /* Number Palindrome
    Write a method called isPalindrome with one int parameter called number.
    The method needs to return a boolean.
    It should return true if the number is a palindrome number otherwise it should return false.
    Check the tips below for more info about palindromes.

    Example Input/Output
    isPalindrome(-1221); → should return true
    isPalindrome(707); → should return true
    isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.*/
    public static void main(String[] args) {
        System.out.println("-1221 = " + isPalindrome(-1221));
        System.out.println("707 = " + isPalindrome(707));
        System.out.println("11212 = " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int n = Math.abs(number);
        while (n > 0) {
            int lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n = n / 10;
        }
        return reverse == Math.abs(number);
    }
}
