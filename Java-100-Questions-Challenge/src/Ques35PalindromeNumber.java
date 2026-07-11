import java.util.Scanner;
public class Ques35PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number.");
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is a palindromme number");

        } else {
            System.out.println("Your number is not palindrome number");
        }

    }

    public static boolean isPalindrome(int num) {
        int reverse=reverse(num);
        return num==reverse;
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }
}