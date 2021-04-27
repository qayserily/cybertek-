package Assignment_8;

public class Question_12 {
    public static void main(String[] args) {

        System.out.println(hamletQuote(false, true));

    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe) {

        boolean result = (toBe != true && notToBe != true) ? false : true;

        return result;

    }

}