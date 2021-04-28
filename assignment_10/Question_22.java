package day25_arrays_part2.Assignment_10;

public class Question_22 {
    public static void main(String[] args) {
        String htmlAdd = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
        System.out.println("input: " + htmlAdd);
        System.out.println("output: " + printID("htmlAdd"));

    }

    public static String printID(String str) {

        int indexID = str.indexOf("id");
        boolean attribute = str.contains("<html>");
        String iD;
        int indexC;
        if (indexID > 0 && attribute) {
            indexC = str.indexOf("\"", indexID + 4);
            iD = str.substring(indexID + 4, indexC);

        } else {
            iD = "Invalid input!";
        }
        return iD;
    }
}
/* Hypertext Markup Language (HTML) is the standard markup language for creating web pages and web applications.
HTML is the language in which most websites are written. HTML is used to create pages and make them functional.

Write a program, that will read HTML variable and output attribute value of id attribute (tag) into the console.
Input will be provided in a single line as outlined below. If HTML variable doesn't contain <html> attribute,
print out into the console message: "Invalid input!".

Sample Output:

     input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
     output: myid
 */
