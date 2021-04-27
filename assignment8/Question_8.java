package Assignment_8;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        System.out.println(fib(n));

    }
    static boolean fib(int n)    {
        int fib=(n-1) + (n-2);
        return false;
    }

}

/* Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers ,for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input : 2
Output : 1

Input : 9
Output : 21 */
