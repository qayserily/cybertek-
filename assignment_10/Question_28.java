package day25_arrays_part2.Assignment_10;

public class Question_28 {
    public static void main(String[] args) {
        System.out.println(clean ("one two three","two"));

        System.out.println(clean ("foo bar","foo"));

        System.out.println(clean ("he said bla bla bla","bla"));

    }
    public static String clean(String text, String badWord) {

        String trimmed = "";
        int nextBadWord = text.indexOf(badWord);
        int start = 0;

        while (nextBadWord != -1) {
            trimmed += text.substring(start, nextBadWord);
            start = nextBadWord + badWord.length();
            nextBadWord = text.indexOf(badWord, start);
        }
        trimmed += text.substring(start).trim();

        return trimmed;
    }
    }

/* This method gets two strings (text and badWord) and returns a string. Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said " */