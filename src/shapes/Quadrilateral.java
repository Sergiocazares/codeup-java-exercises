package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public abstract void setLength(double n);
    public abstract void setWidth(double n);

}