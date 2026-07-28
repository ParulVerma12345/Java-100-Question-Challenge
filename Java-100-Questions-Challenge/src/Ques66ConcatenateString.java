import java.util.Scanner;
public class Ques66ConcatenateString {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First String:");
        String s1=input.nextLine();
        System.out.println("Enter Second String:");
        String s2=input.nextLine();
        String result=s1.concat("").concat(s2);
        System.out.println("Concatenated String:"+result);
        System.out.println("Uppercase:" +result.toUpperCase());
    }

}
