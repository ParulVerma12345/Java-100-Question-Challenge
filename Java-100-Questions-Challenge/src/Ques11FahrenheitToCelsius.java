//Create a program to convert Fahrenheit to Celsius.
import java.util.Scanner;

public class Ques11FahrenheitToCelsius {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to  the Temperature converter ");
        System.out.println("Please enter your temp in F:");
        float fah=input.nextFloat();
        float cel=(fah-32)*5.0f/9.0f;
        System.out.println("Your temperature is:"+cel+"C");

    }
}
