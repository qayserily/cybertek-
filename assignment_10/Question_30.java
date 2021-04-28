package day25_arrays_part2.Assignment_10;

public class Question_30 {
    public static void main(String[] args) {

        System.out.println(at3("longword","foo"));

        System.out.println(at3("blabla","a"));
    }

    public static String at3(String str1, String str2) {

        return str1.substring(0, 3) + str2 + str1.substring(3);

    }
}
/* at3 method gets two strings and returns a string. The first string is the one that will be manipulated. At the 3rd char position of the target you will insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla" */