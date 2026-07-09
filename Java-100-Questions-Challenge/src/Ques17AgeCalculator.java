//Create a program that categorize a person into different age groups.
import java.util.Scanner;
public class Ques17AgeCalculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to tha Age Calculator");
        System.out.println("Please enter the age:");
        int age=input.nextInt();
        if(age>=65){
            System.out.println("You are a senior citizen");

        }else if(age>=20){
            System.out.println("You are an adult");
        }else if(age>=13){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are a child");
        }
    }
}
