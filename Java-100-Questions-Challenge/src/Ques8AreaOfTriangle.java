//create a program to calculate the Area  of a Triangle.
import java.util.Scanner;
public class Ques8AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Area Calculator");
        System.out.println("Please enter the sides of triangle in cms:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double Area=0.5*a*b;
        System.out.println("The area of your triangle is:"+Area+"cms2");



    }
}