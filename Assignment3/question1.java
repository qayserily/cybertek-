public class Question1 {
    public static void main(String[] args) {
        /* Write a program to convert gallons into Liters and display it.
        Sample output:
        15 gallon is 56.7812 liter */

        double gallon = 3.78541178d ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to convert gallons into liters : ");
        double output = scanner.nextDouble();
        System.out.println(output+" gallon is : " + (output*gallon) + " liters");
