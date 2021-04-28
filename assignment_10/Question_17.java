package day25_arrays_part2.Assignment_10;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };

        for (int i = 0; i < alphabet.length; i++) {
        }
        Scanner scn = new Scanner(System.in);

        char first;
        char second;
        char letters;

        System.out.println("Enter your first letter:");
        first = scn.next().charAt(0);
        System.out.println("Enter your second letter:");
        second = scn.next().charAt(0);

        for (int i = first; i < second + 1; i++) {

            System.out.print((char) i);
        }
    }
}


/* Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO */