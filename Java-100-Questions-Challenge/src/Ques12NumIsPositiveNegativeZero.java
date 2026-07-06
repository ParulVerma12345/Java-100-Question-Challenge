//Create a program to find number is positive, negative or zero.
import java.util.Scanner;
public class Ques12NumIsPositiveNegativeZero {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        if (num>0) {
            System.out.println(
                    "Your name is positive"
            );
        }else if(num==0){
            System.out.println("Your number is zero");

        }else {
            System.out.println("Your name is negative");
        }

    }
}
