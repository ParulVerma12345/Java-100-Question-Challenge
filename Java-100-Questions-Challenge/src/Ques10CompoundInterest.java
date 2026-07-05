//create a program to calculate Compound interest.
import java.util.Scanner;
public class Ques10CompoundInterest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the compound calculator");
        System.out.println("Please enter the principle of amount in Rs:");
        int principle=input.nextInt();
        System.out.println("Now enter the rate of interest:");
        float rate=input.nextFloat();
        System.out.println("Now enter the time of borrowing the money");
        float time=input.nextFloat();
        double CompInterest=principle*Math.pow(1+rate/100,time);
        System.out.println("compound interest in Rs:"+CompInterest);
    }
}
