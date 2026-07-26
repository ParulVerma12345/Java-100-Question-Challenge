import java.util.Scanner;
public class Ques61ContinueStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
        System.out.println("Enter number:");
        int n = input.nextInt();
        if (n < 0)
            continue;
        sum = sum + n;
    }
    System.out.println("Sum="+sum);

}           }

