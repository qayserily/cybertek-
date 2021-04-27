package Assignment_8;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i = scanner.nextInt();
        next3(i);
    }
    public static void next3(int i){
        System.out.println("The next 3 numbers are : " + (i+1) + " " + (i+2) + " " + (i+3));
    }
}

/* Create a method called next3 .
This method gets an int argument and prints the next 3 numbers after that number.
Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers) */