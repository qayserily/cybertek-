package Assignment_8;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter second number : ");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println(result);
        plus(a,b);
    }
    public static int plus(int a , int b){
        int result = 0;
        return result;
    }
}

/* Question-1
Create a method called "plus", its return is void and it gets no arguments.
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.
Example:
enter first number:
1
enter second number:
2
result: 3 */
