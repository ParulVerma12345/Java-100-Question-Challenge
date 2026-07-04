import java.util.Scanner;
 public class Ques5ArithmeticOperators {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Arithmetic calculator\n");
        System.out.println("Please enter first number:");
        int first=input.nextInt();
        System.out.println("Now,please enter second number");
        int second=input.nextInt();
        int add=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;
        System.out.println("Addition is:"+add);
        System.out.println("subtraction is:"+sub);
        System.out.println("Multiplication is:"+mul);
        System.out.println("division is:"+div);
        System.out.println("Modulus is:"+mod);


     }

}
