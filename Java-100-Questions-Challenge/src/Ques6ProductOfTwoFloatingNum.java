//Create a program to calculate product of two floating points numbers.
import java.util.Scanner;
public class Ques6ProductOfTwoFloatingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication of two floating numbers\n");
        System.out.print("Please enter first decimal number:");
        double first = input.nextDouble();
        System.out.print("Now,Please enter second number:");
        double second = input.nextDouble();
        double mul = first * second;
        System.out.println("\n  Result is:" + mul);
    }
}