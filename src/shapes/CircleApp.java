package shapes;

import util.Input;

public class CircleApp {

    public static void getRadius() {

        Input input = new Input();
        do {
            double userRadius = input.getDouble();
            Circle circle1 = new Circle(userRadius);
            double userArea = circle1.getArea();
            double userCircumference = circle1.getCircumference();
            System.out.printf("Radius: %s \nArea: %s \nCircumference: %s\n", userRadius, userArea, userCircumference);
        } while (input.yesNo("Do you want to continue?"));
        System.out.printf("You created %d circles.", Circle.circleCount);
    }

    public static void main(String[] args) {
        getRadius();
    }
}