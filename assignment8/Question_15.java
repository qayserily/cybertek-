package Assignment_8;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your task : ");
        String task = scanner.next();
        System.out.println(validateTask(task));
    }

    private static boolean validateTask(String task) {
        if (task == ""){
            System.out.println("You must enter your task!!!");
        }else {
            int currentID = 0;
            int taskID = currentID + 1;
            currentID++;
            taskID++;
        }
        return false;
    }
    
   
}
