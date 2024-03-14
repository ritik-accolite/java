// import java.awt.Rectangle;
import java.util.*;
// import java.util.ArrayList;
// import java.util.List;
abstract class Shape {
    abstract void draw();
    
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
public class GenericTEst {
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s:lists){
            s.draw();
        }
    }    
    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
