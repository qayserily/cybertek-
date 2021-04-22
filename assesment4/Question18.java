package day21_stringManipulation_part3.AssessmentTest4;

import jdk.swing.interop.SwingInterOpUtils;

public class Question18 {
    public static void main(String[] args) {
        String s = "MINUMUM" ;

        System.out.println(s.substring(4,7));
        System.out.println(s.substring(5));
        System.out.println(s.substring(s.indexOf("I" , 3)));
        System.out.println(s.substring(s.indexOf('N')));

        //1


    }
}
