import java.util.Scanner;
public class Ques69GuessGame {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int random=(int)(Math.random()*10)*1;
        int guess;
        do{
            System.out.println("Enter your guess(1-10):");
            guess=input.nextInt();
            if(guess>random){
                System.out.println("too High");

            }else if(guess<random){
                System.out.println("Too Low");
            }
        }while(guess!=random);
        System.out.println("Congratulations! Correct Guess.");
    }
}
