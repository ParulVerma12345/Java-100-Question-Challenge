import java.util.Scanner;

public class Ques21BitwiseCompliment {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing Bitwise Compliment operator\n");
        System.out.println("Please enter the your number:");
        int num=input.nextInt();
        int result=~num;
        System.out.println("Result is:"+result);

    }
}

