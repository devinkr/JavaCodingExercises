public class LastDigitChecker {
/*    Last Digit Checker
    Write a method named hasSameLastDigit with three parameters of type int.
    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

    EXAMPLE INPUT/OUTPUT:
    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000*/
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c) ) return false;
        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;
        return aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
