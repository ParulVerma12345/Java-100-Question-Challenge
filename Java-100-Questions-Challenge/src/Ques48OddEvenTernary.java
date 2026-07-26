import java.util.Scanner;
public class Ques48OddEvenTernary {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the odd or even\n");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        String result=num%2==0?"Even":"Odd";
        System.out.println("Your no. is :"+result);
    }
}
