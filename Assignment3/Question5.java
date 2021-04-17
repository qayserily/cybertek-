import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /* Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds */

        int second = 1;
        int minute= 60*second ;;
        int hours = 60*minute ;


        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter second to convert hour , minute : ");
        int inputSeconds = scanner.nextInt();
        if (inputSeconds<60){
            System.out.println(inputSeconds + "seconds");
        } else if (inputSeconds>=60 ){
            System.out.println(inputSeconds/minute + " minutes " + inputSeconds%minute + " seconds");
        } else{
            System.out.println("Invalid enterance ");
        }


    }
}
