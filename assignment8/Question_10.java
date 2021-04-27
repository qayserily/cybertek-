package Assignment_8;

import java.util.Scanner;

public class Question_10 {
    public static boolean main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0){
            return true;
        } else{
            return false;
        }

    }
    }
/* isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true */

