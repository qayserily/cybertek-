package task;

public class Question_10 {
    public static void main(String[] args) {
        /* In this assignment, you will write code to put together the time of day.
        Like this: 12:24:33 PM
        1. Declare variables: hour, minute, second that can hold int values.
         Declare amOrPm variable that can hold a String ("AM" or "PM")
        2. An instructor will set different values to your variables
        3. Using the variables and concatenation, print values in the format mentioned above. */

        int hour = 12 ;
        int minute = 24 ;
        int second = 33 ;
        String amOrPm = "AM";

        System.out.println(hour+ ":" + minute + ":" + second +amOrPm);


    }
}
