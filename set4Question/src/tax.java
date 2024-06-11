import java.util.Scanner;

public class tax {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("SELECT FROM THE CATEGORY");
        System.out.println("Press 1 if Between 2.5 Lakhs to 5 Lakhs");
        System.out.println("Press 2 if Between 5 Lakhs to 10 Lakhs");
        System.out.println("Press 3 if Above 10 Lakhs");
        System.out.println("Press 4 if Less than 2.5 Lakhs");

        int input = user.nextInt();

        switch (input) {
            case 1:
                System.out.println("Your tax will be 5%");
                break;
            case 2:
                System.out.println("Your tax will be 20%");
                break;
            case 3:
                System.out.println("Your tax will be 30%");
                break;
            case 4:
                System.out.println("No taxes applied if income is below 2.5 lakhs");
                break;
            default:
                System.out.println("Invalid option selected");
                return;
        }

        System.out.println("Do you want to calculate your income tax (Y/N): ");
        char cal = user.next().charAt(0);

        if (cal == 'Y' || cal == 'y') {
            System.out.println("Enter your income in numbers: ");
            double income = user.nextDouble();

            if (income < 250000) {
                System.out.println("No taxes applied if income is below 2.5 lakhs");
            } else if (income >= 250000 && income <= 500000) {
                double tax = (income * 5) / 100;
                System.out.println("Your tax will be: " + tax);
            } else if (income > 500000 && income <= 1000000) {
                double tax = (income * 20) / 100;
                System.out.println("Your tax will be: " + tax);
            } else if (income > 1000000) {
                double tax = (income * 30) / 100;
                System.out.println("Your tax will be: " + tax);
            } else {
                System.out.println("Invalid income!");
            }
        }
    }
}