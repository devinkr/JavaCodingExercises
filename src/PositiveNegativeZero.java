public class PositiveNegativeZero {

//    Write a method called checkNumber with an int parameter number.
//
//    The method should not return any value, and it needs to print out:
//
//            "positive" if the parameter number is > 0
//
//            "negative" if the parameter number is < 0
//
//            "zero" if the parameter number is equal to 0
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

    }
    // write code here
    public static void checkNumber(int number) {
        String result = "";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        System.out.println(result);
    }
}
