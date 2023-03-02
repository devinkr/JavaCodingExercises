public class DiagonalStar {
/*    Diagonal Star
    Write a method named printSquareStar with one parameter of type int named number.
    If number is < 5, the method should print "Invalid Value".
    The method should print diagonals to generate a rectangular pattern composed of stars (*).
    This should be accomplished by using loops (see examples below).

    EXAMPLE INPUT/OUTPUT:
    EXAMPLE 1
    printSquareStar(5); should print the following:
        *****
        ** **
        * * *
        ** **
        *****

    Explanation:
        *****   5 stars
        ** **   2 stars space 2 stars
        * * *   1 star space 1 star space 1 star
        ** **   2 stars space 2 stars
        *****   5 stars

    EXAMPLE 2
    printSquareStar(8); should print the following:
            ********
            **    **
            * *  * *
            *  **  *
            *  **  *
            * *  * *
            **    **
            ********

    The patterns above consist of a number of rows and columns (where number is the number of rows to print).
    For each row or column, stars are printed based on four conditions (Read them carefully):
    In the first or last row
    In the first or last column
    When the row number equals the column number
    When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)*/
    public static void main(String[] args) {

    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || column == 0 || row == number -1 || column == number -1 || column == row || column == number-1-row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
