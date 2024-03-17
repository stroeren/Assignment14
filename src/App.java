import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        choice = scanner.nextInt();
        while (choice != 5) {
            if (choice == 1) {
                System.out.println("Enter a distance in miles");
                double miles = scanner.nextDouble();
                double kilometers = miles * 1.60934;
                System.out.println(miles + " miles is " + kilometers + " kilometers");
                System.out.println("Bomba!!!!");
            }
            if (choice == 2) {
                System.out.println("Enter a distance in feet");
                double feet = scanner.nextDouble();
                double meters = feet * 0.3048;
                System.out.println(feet + " feet is " + meters + " meters");
                System.out.println("Bomba!!!!");
            }
            if (choice == 3) {
                System.out.println("Enter a distance in inches");
                double inches = scanner.nextDouble();
                double centimeters = inches * 2.54;
                System.out.println(inches + " inches is " + centimeters + " centimeters");
                System.out.println("Bomba!!!!");
            }
            if (choice == 4)
            {
                System.out.println("Enter a weight in pounds.");
                double pounds = scanner.nextDouble();
                double kilograms = pounds * 0.453592;
                System.out.println(pounds + " pounds is " + kilograms + " kilograms");
                System.out.println("Bomba!!!!");
            }
            System.out.println("Enter a choice: 1. Miles to Kilometers 2. Feet to Meters 3. Inches to Centimeters 4. Pounds to Kilograms 5. Quit");
            choice = scanner.nextInt();
        }
        scanner.close();
    }
}
