package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(5,4);
        System.out.println("Perimeter for My Shape 1: " + myShape1.getPerimeter());
        System.out.println("Area for My Shape 1: " + myShape1.getArea());

        Measurable myShape2 = new Square(5);
        System.out.println("Perimeter for My Shape 1: " + myShape2.getPerimeter());
        System.out.println("Area for My Shape 1: " + myShape2.getArea());

//        System.out.println(myShape2.getLength());
//        Doesn't work because we are holding on to a Measurable




//
//        Rectangle box1 = new Rectangle(5.0,4.0);
//        Rectangle box2 = new Square(5.0);
//
//        System.out.println("Perimeter for Box 1: " + box1.getPerimeter());
//        System.out.println("Area for Box 1: " + box1.getArea());
//        System.out.println();
//        System.out.println("Perimeter for Box 2: " + box2.getPerimeter());
//        System.out.println("Area for Box 2: " + box2.getArea());

    }
}