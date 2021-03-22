package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double n) {
        this.length = n;
    }

    @Override
    public void setWidth(double n) {
        this.width = n;
    }
}