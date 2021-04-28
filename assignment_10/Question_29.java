package day25_arrays_part2.Assignment_10;

public class Question_29 {
    public static void main(String[] args) {
        // This method gets a string and an int, it returns a string.
        // What it does is to limit the inputted string to a creating number of characters.
        //  ***** I don't think that I have totally understood this statement! *****


        System.out.println(limit("abcd", 2));

        System.out.println(limit("bla bla", 3));

    }

    public static String limit(String str, int cap) {

        String uniqueChar = "";


        for (int i = 0; i < str.length(); i++) {
            if (!uniqueChar.contains(str.substring(i, i + 1))) {
                uniqueChar += str.substring(i, i + 1);
            }
        }

        return uniqueChar.substring(0, cap);

    }
}
/* This method gets a string and an int, it returns a string. What it does is to limit the inputted string to a creating number of characters.

Sample Output:

     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla" */