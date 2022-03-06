package Lesson3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int number1,number2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        number2 = input.nextInt();

        System.out.println("Please Make a Selection!");
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Result : " + (number1+number2));
                break;
            case 2:
                System.out.println("Result : " + (number1-number2));
                break;
            case 3:
                System.out.println("Result : " + (number1*number2));
                break;
            case 4:
                switch (number2) {
                    case 0 :
                        System.out.println("ERROR");
                        break;
                    default:
                        System.out.println("Result : " + (number1/number2));

                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
