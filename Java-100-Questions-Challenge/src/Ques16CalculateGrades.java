
import java.util.Scanner;
public class Ques16CalculateGrades {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Grade calculator\n");
        System.out.println("Please enter your percentage:");
        float percentage=input.nextFloat();
        if(percentage>=90) {
            System.out.println("Great,you have got A");
        }else if(percentage>=75) {
            System.out.println("God,you have got B");
        }else if(percentage>=60) {
            System.out.println("You have got C,Work harder next time");
        }else if(percentage>=30) {
            System.out.println("You have got D,you seriously need to work hard");
        }else{
            System.out.println("Sorry,You have failed the test");
        }
    }
}
