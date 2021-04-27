package Assignment_8;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i = sc.nextInt();
        cube(i);
    }

    public static void cube(int i) {

            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }
    }


/* Create a method called cube. Write all required code inside this method in order to ask the
user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125 */