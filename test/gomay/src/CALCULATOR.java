import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the firstnumber");
        int firstnumber=input.nextInt();
        System.out.println("enter the secondnumber");
        int secondnumber =input.nextInt();
        System.out.println("Please enter operation(+,-,/,*)");
        char operation = input.next().charAt(0);

        if (operation == '+')
            System.out.println("your answer is" + (firstnumber +secondnumber));

        else if (operation == '-'){
            System.out.println("your answer is" + (firstnumber - secondnumber));
        }
        else if (operation == '/'){
            System.out.println("your answer is" + (firstnumber / secondnumber));
        }
        else if(operation == '*'){
            System.out.println("your answer is" + (firstnumber * secondnumber));
        }
    }

    }

