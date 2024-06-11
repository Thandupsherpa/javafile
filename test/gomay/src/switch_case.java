import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day  = user.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("invalid");
                break;
        }
    }
}
