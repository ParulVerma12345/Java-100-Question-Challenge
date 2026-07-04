
    //create a program to swap two numbers.
import java .util.Scanner;
    public class Ques4SwapTwoNumbers {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("welcome to Swapping station\n\n");
            System.out.println("Enter value of A:");
            int a = input.nextInt();
            System.out.print("Enter value of B:");
            int b = input.nextInt();
            int c = a;
            a = b;
            b = c;
            System.out.println("Swapping done....");
            System.out.println("Value of a is:" + a);
            System.out.println("Value  of b is:" + b);

        }
    }


