import java.util.Scanner;
public class Ques53PasswordChecker {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to set your password\n");
     String password;
        do{
            System.out.println("Please enter your password:");
             password=input.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for valid password");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
