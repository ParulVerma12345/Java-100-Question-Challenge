import java.util.Scanner;
public class Ques49AbsoluteTernary {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Absolute Value\n");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        int result=num>=0?num:-num;
        System.out.println("Absolute value is:"+result);
    }
}
