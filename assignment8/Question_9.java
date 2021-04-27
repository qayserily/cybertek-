package Assignment_8;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.println(max(x,max));
    }

    private static int max(int x , int max) {

        if (x > max) {
            return max;
        } else {
            return x;
        }
    }
}

/* Create a method called max. It gets two ints, x and max.
x is the test case, max is what we test against.

if x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5 */
