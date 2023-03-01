public class SharedDigit {
/*    Shared Digit
    Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the
    range, the method should return false.
    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise,
    the method should return false.

    EXAMPLE INPUT/OUTPUT:
    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers*/
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99) return false;
        if (b < 10 || b > 99) return false;
        int aCopy = a;
        int bCopy = b;
        while (aCopy > 0) {
            int aDigit = aCopy % 10;
            while (bCopy > 0) {
                int bDigit = bCopy % 10;
                if (aDigit == bDigit) return true;
                bCopy /= 10;
                bDigit = bCopy % 10;
            }
            aCopy /= 10;
            bCopy = b;
        }
        return false;
    }
}
