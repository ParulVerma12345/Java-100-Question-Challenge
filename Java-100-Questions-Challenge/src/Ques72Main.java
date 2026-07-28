
import com.example.geometry.circle;
import com.example.geometry.Rectangle;
import com.example.utils.Calculator;

public class Ques72Main {

    public static void main(String[] args) {

        circle c = new circle(7);

        Rectangle r = new Rectangle(10, 5);

        Calculator cal = new Calculator();

        System.out.println("Circle Area = " + cal.areaCircle(c));
        System.out.println("Rectangle Area = " + cal.areaRectangle(r));
    }
}