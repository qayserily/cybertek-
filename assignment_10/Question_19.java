package day25_arrays_part2.Assignment_10;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {


        System.out.println("Input:  javaxjava");
        System.out.println("Output: " + countJava("javaxjava"));

        System.out.println("Input:  javaxjavaapplepearjavaegg");
        System.out.println("Output: " + countJava("javaxjavaapplepearjavaegg"));

    }

    public static int countJava(String str) {


        str = str.toLowerCase();
        int count = 0;
        int nextJava = str.indexOf("java");

        while (nextJava != -1) {
            count++;
            nextJava = str.indexOf("java", nextJava + 1);
        }

        return count;
    }
}
/*Question-19

Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3*/
