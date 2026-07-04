
    //create a program to input of the person and respond with "welcome Name to KG Coding"
import java.util.Scanner;
    public class Ques2PrintInputName {

        public static void main(String[] args) {
            System.out.println("Please enter your name:");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Welcome " + name + " Kg Coding");
        }
    }

