package Assignment_8;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        int rows, columns;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nunber of rows: ");
        rows = scan.nextInt();

        System.out.print("Enter the nunber of rows: ");
        columns = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}

/* Question-4

Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*/
