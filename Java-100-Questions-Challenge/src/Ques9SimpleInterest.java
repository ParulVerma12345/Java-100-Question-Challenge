//create a program to calculate simple interest.
import java.util.Scanner;
public class Ques9SimpleInterest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to simple interest calculator\n");
        System.out.println("Please enter your principle amount Rs:");
        int principle=input.nextInt();
        System.out.println("Now,Tell me your rate of interest:");
        float rate=input.nextFloat();
        System.out.println("Now,tell me for how many years are you borrowing this money:");
        float years=input.nextFloat();
        float interest=(principle*rate*years)/100;
        System.out.println("\n\nsimple interest:"+interest);


    }
}
