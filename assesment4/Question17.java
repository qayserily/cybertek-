package day21_stringManipulation_part3.AssessmentTest4;

public class Question17 {
    public static void main(String[] args) {
        String str="" ;
        int k = m1(str.length()) ;
        k+=3 + ++k;
        System.out.println(k);
    }

    public static int m1(int i) {
        return  ++i;
    }
}
