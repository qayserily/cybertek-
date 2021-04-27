package Assignment_8;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num = scanner.nextInt();
        int num1= scanner.nextInt();
        int num2 = scanner.nextInt();

        sign(num);
        sign(num1);
        sign(num2);

    }

    public static void sign(int i) {
       if (i>=1){
           System.out.println("Number is positive");
       } else if (i==0){
           System.out.println("Number is zero");
       } else{
           System.out.println("Number is negative");
       }
    }

}


/* Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

the parameter should be entered by user (create a scanner object) */
