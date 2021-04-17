import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int portion = 300 ;
		int cookieFor1Portion = 4 ;
		int cookie = 40 ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("There are 4 cookies in 1 serving. Please enter how many servings of cookies you eat :  ");
		int prtn = scanner.nextInt();
		System.out.println("You ate : " + (portion*cookieFor1Portion) + " calories");
		
		

	}

}
