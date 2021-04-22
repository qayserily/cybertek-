package day21_stringManipulation_part3.AssessmentTest4;

public class question16 {
    public static void main(String[] args) {
        String str = "Cybertek Students" ;
        int x = str.indexOf("t" , 8) ;
        System.out.println(str.substring(3,x));
    }
}
