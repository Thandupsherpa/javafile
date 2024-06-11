import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter the year you want to check: ");
        int input = user.nextInt();

        if  ((input % 4 == 0 && input % 100 != 0) || (input % 400 == 0)){
            System.out.println("Its a leap year");
        }else{
            System.out.println("Not a leap year");
        }

    }
}