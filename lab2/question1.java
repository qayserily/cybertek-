import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 numbers : ");
		int num1 = scanner.nextInt() ;
		int num2 = scanner.nextInt() ;
		int num3 = scanner.nextInt(); 
		
		if(num1 > num2&& num1> num3) {
			System.out.println("Number 1 is the biggest number");			
		} else if (num2 > num1&& num2> num3) {
			System.out.println("Number 2 is the biggest number");		
		} else if (num3 > num1&& num3> num2) {
			System.out.println("Number 3 is the biggest number");
		} else {
			System.out.println("Invalid enterance or numbers are equal");
		}
	}
}
