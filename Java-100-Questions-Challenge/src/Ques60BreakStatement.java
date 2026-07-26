import java.util.Scanner;
public class Ques60BreakStatement {
    public static void main(String[] args) {
        System.out.println("Welcome to the Break Statement");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word:");
            String word = input.next();
            if (word.equals("exit")) {
                break;
            }
            System.out.println("You entered:" + word);
        }

        System.out.println("Program End");

    }
}

