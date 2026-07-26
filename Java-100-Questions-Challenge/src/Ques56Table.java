import java.util.Scanner;
public class Ques56Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" +i + "=" + (n + i));
        }

    }
}
