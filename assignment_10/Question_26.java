package day25_arrays_part2.Assignment_10;

public class Question_26 {
    public static void main(String[] args) {

            System.out.println(uniqueChars("java"));

            System.out.println(uniqueChars("mama"));

            System.out.println(uniqueChars("spoon"));

        }
        public static String uniqueChars(String str) {

            String uniqueChar = "";


            for (int i = 0; i < str.length(); i++) {
                if (!uniqueChar.contains(str.substring(i, i + 1))) {
                    uniqueChar += str.substring(i, i + 1);
                }
            }

            return uniqueChar;
        }
    }

/* uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon" */