//Create a program to determine if number is odd or even.
import java.util.Scanner;

public class Ques13OddEven {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the odd even calculator\n ");
        System.out.println("Please enter your name:");
        int num=input.nextInt();
        if(num%2==0) {
            System.out.println("Your number is an even number.");
        }else{
            System.out.println("Your number is a odd number.");
        }
    }
}
