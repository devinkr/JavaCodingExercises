public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println("" + hasTeen(9, 99, 19));
        System.out.println("" + hasTeen(23, 15, 42));
        System.out.println("" + hasTeen(22, 23, 34));
    }
    /**
     * Checks if one of the parameters is in range 13-19 inclusive
     *
     * @param a age of person a
     * @param b age of person b
     * @param c age of person c
     * @return true if one of the params is in range of 13-19 inclusive otherwise false
     */
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
