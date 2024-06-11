import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter First subject marks: ");
        float Sub1 = user.nextInt();
        System.out.println("Enter Second subject marks: ");
        float Sub2 = user.nextInt();
        System.out.println("Enter Third subject marks; ");
        int Sub3 = user.nextInt();

        float marks = Sub1+Sub2+Sub3;
        System.out.println(marks);

        float result = marks/300*100;

        if (result >= 33){
            System.out.println("You are pass: "+result);
        } else  {
            System.out.printf("You failed: "+result);
        }
    }
}