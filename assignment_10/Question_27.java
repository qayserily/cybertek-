package day25_arrays_part2.Assignment_10;

public class Question_27 {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me"));

        System.out.println(coverString("Certified Wooden Spoon", "o"));

        System.out.println(coverString("apples", "pears"));

    }
    public static String coverString(String strSr, String strJr) {

        String  covered = "";
        int nextJr = strSr.indexOf(strJr);
        int lenghtJr = strJr.length();
        int start = 0;

        if (nextJr == -1) {
            covered = "[" + strSr + "]";
        } else {

            while (nextJr != -1) {
                covered += strSr.substring(start, nextJr) + "[" + strJr + "]";
                start = nextJr + lenghtJr;
                nextJr = strSr.indexOf(strJr, start);
            }
            covered += strSr.substring(start);
        }

        return covered;

    }
    }


/* coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Sample Output:

     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]" */