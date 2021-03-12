package shapes;

import util.Input;

public class Circle {

    private final double radius;
    public static int circleCount;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
//        Math.PI * Math.pow(this.radius, 2);
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }


}
