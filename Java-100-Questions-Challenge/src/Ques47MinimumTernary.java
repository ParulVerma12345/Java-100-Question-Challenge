import java.util.Scanner;

public class Ques47MinimumTernary {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to finding minimum\n");
        System.out.println("Please enter your first number:");
        int num1=input.nextInt();
        System.out.print("Please enter your second number");
        int num2=input.nextInt();
        Ques47MinimumTernary ternary=new Ques47MinimumTernary();
        int min=ternary.min(num1,num2);
        System.out.println("Minimum number is:"+min);
    }
    public int min(int num1,int num2){
        return num1<num2?num1:num2;

    }
}
