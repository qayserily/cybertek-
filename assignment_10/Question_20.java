package day25_arrays_part2.Assignment_10;

public class Question_20 {
    public static void main(String[] args) {
        System.out.println("Input:  5");
        System.out.println("Output: " + getFactorial(5));

        System.out.println("Input: 15");
        System.out.println("Output: " + getFactorial(15));

    }

    public static int getFactorial(int x) {

        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;

        }

        return factorial;
    }
}
/* In mathematics, the factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Sample Output:

     input: 5
     output: 120 */