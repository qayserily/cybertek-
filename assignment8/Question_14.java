package Assignment_8;

public class Question_14 {
    public static void main(String[] args) {
        System.out.println(atLeastTwo(true,false,true));
    }
    public static boolean atLeastTwo(boolean a, boolean b, boolean c) {
        if ((a && b) || (b && c) || (a && c)) {
            return true;
        }
        else{
            return false;
        }
    }
}
/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table */