public class DecimalComparator {

    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        String strA = a+"";
        String strB = b+"";
        String[] arrA = strA.split(".");
        String[] arrB = strB.split(".");
        String subA = arrA[1].substring(0,3);
        String subB = arrB[1].substring(0,3);
        return arrA[0].equals(arrB[0]) && subA.equals(subB);
    }
}
