package Assignment_8;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }



}

/* Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false */
