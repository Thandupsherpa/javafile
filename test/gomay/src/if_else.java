import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = user.nextInt();
        if  (age > 18) {
            System.out.println("eligible to vote");
        }
        else if (age >= 18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not able to vote, your are: "+age);
        }
    }
}
