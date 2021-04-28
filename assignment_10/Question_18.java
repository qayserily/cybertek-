package day25_arrays_part2.Assignment_10;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        String word, separator;
        int counter;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = scn.nextLine();
        System.out.println("Enter a separator: ");
        separator = scn.nextLine();
        System.out.println("Enter a counter: ");
        counter = scn.nextInt();

        String lastWord;

        for (int i = 0; i < counter; i++) {

            System.out.print(word);
            if (i == counter - 1) {
                break;
            }
            for (int j = 0; j < counter; j++) {
                System.out.print(separator);
                break;
            }
        }
    }
}

/* Question-18
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.
Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This */
