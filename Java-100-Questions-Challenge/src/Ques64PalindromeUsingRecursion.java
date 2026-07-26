import java.util.Scanner;
public class Ques64PalindromeUsingRecursion {
    static boolean check(String str,int start,int end){
        if(start>=end)
            return true;
        if(str.charAt(start)!=str.charAt(end))
            return false;
        return
                check(str,start+1,end-1);

    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=input.nextLine();
        if(check(str,0,str.length()-1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
