import java.util.Scanner;
public class Ques67Circle {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Radius:");
        double r=input.nextDouble();
        double area=Math.PI*r*r;
        double circumference=2*Math.PI*r;
        System.out.println("Area=" +area);
        System.out.println("Circumference=" +circumference);
    }
}
