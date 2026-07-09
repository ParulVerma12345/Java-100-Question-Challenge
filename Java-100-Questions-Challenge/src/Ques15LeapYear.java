//Create a program that determines is a given year is a leap year.
import java.util.Scanner;
public class Ques15LeapYear {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Leap year calculator.");
        System.out.println("Please enter the year:");
        int year=input.nextInt();
        if (year%400==0) {
            System.out.println(" Given year is leap year.");
        }else if (year%100==0) {
            System.out.println("Given year is not a leap year.");
        }else if (year%4==0) {

            System.out.println("Given year is a leap year");
        }else{
            System.out.println("your year is not a leap year");
        }

    }

}
