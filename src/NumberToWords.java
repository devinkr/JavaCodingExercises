public class NumberToWords {
/*    Number To Words
    Write a method called numberToWords with one int parameter named number.
    The method should print out the passed number using words for the digits.
    If the number is negative, print "Invalid Value".
    To print the number as words, follow these steps:
    Extract the last digit of the given number using the remainder operator.
    Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
    those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if
    the digit is 0, "One" if the digit is 1, and so on.
    Remove the last digit from the number.
    Repeat Steps 2 through 4 until the number is 0.
    The logic above is correct, but in its current state, the words will be printed in reverse order. For example,
    if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To
    overcome this problem, write a second method called reverse.

    The method reverse should have one int parameter and return the reversed number (int). For example, if the number
    passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.

    Use the method reverse within the method numberToWords in order to print the words in the correct order.

    Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
    The logic above for the method numberToWords will print "One", but that is incorrect. It should print
    "One Zero Zero". To solve this problem, write a third method called getDigitCount.

    The method getDigitCount should have one int parameter called number and return the count of the digits in that
    number. If the number is negative, return -1 to indicate an invalid value.
    For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has
    3 digits (1, 0, 0).

    Example Input/Output - getDigitCount method
    getDigitCount(0); should return 1 since there is only 1 digit
    getDigitCount(123); should return 3
    getDigitCount(-12); should return -1 since the parameter is negative
    getDigitCount(5200); should return 4 since there are 4 digits in the number

    Example Input/Output - reverse method
    reverse(-121); should  return -121
    reverse(1212); should return  2121
    reverse(1234); should return 4321
    reverse(100); should return 1

    Example Input/Output - numberToWords method
    numberToWords(123); should print "One Two Three".
    numberToWords(1010); should print "One Zero One Zero".
    numberToWords(1000); should print "One Zero Zero Zero".
    numberToWords(-12); should print "Invalid Value" since the parameter is negative.*/
    public static void main(String[] args) {
        System.out.println("getDigitCount");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("reverse");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("numberToWords");
        numberToWords(123); //should print "One Two Three".

        System.out.println("numberToWords2");
        numberToWords(1010); //should print "One Zero One Zero".

        System.out.println("numberToWords3");
        numberToWords(1000); //should print "One Zero Zero Zero".

        System.out.println("numberToWords4");
        numberToWords(-12); //should print "Invalid Value" since the parameter is negative.


    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCount = 0;
        while (number > 9) {
            number = number / 10;
            digitCount++;
        }
        digitCount++;
        return digitCount;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int n = Math.abs(number);
        while (n > 0) {
            int lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n = n / 10;
        }
        if (number < 0) {
            return reverse - (2 * reverse);
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int reversedNumber = reverse(number);
        int numberDigitCount = getDigitCount(number);
        int reversedNumberDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            reversedNumber /= 10;

            switch(lastDigit) {
                case 0: {
                    System.out.println("Zero");
                    break;
                }
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }
                case 8: {
                    System.out.println("Eight");
                    break;
                }
                case 9: {
                    System.out.println("Nine");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }
        }

        if (numberDigitCount != reversedNumberDigitCount) {
            int digitDifference = numberDigitCount - reversedNumberDigitCount;
            for (int i = 0; i < digitDifference; i++) {
                System.out.println("Zero");
            }
        }
    }
}
