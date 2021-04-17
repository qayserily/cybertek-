import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /* Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
        Write a program with a variable that holds the number of milligrams of caffeine in a drink
        and outputs how many drinks it takes to kill a person.
        Sample Output
         Number of milligrams in drink: 500
         It would take about 20 drinks for a lethal overdose */

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Please enter how many grams caffeine has your drink : ");
        int NumberOfMilligrams = scanner.nextInt();
        if (NumberOfMilligrams>10){
            System.out.println("Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose");
        } else{
            System.out.println("you can drink it");
        }
    }
}
