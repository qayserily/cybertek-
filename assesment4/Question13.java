package day21_stringManipulation_part3.AssessmentTest4;

public class Question13 {
    public static void main(String[] args) {
        String str= "Javascript" ;
        System.out.println(getMsg(str));
    }

    public static String getMsg(String str) {
        String msg = "Input value must be" ;
        msg = msg.concat("smallar than x") ;
        CharSequence x = null;
        msg.replace("X" , x);
        String rest = " and larger than 0" ;
        msg.concat(rest) ;
        return msg ;
        //input value must be smaller than x
   }
}
