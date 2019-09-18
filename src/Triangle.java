public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double halfP;

    @Override
    public double calcArea() {
        halfP = (a + b + c) / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b + ", c = " + c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
