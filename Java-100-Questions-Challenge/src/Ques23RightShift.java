import java.util.Scanner;


    public class Ques23RightShift {
        public static void main(String[]args){
            Scanner input=new Scanner(System.in);
            System.out.println("Showcasing right shift operator\n");
            System.out.println("Please enter the your number:");
            int num=input.nextInt();
            int result=num>>1;
            System.out.println("Result is:"+result);

        }
    }

