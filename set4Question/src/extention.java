import java.util.Scanner;

public class extention{
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter your url: ");

        String input = user.nextLine();

        if (input.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (input.endsWith(".org")) {
            System.out.println("Organizational website");
        }
        else if (input.endsWith(".in")) {
            System.out.println("Indian website");
        }

    }
}