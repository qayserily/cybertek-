package day21_stringManipulation_part3.AssessmentTest4;

public class Question11 {
    public static void main(String[] args) {
        String space = " " ;
        String composite = space+"hello"+space+space ;
        composite.concat("world") ;
        String trimmed = composite.trim() ;
        System.out.println(trimmed.length());
    }
}
