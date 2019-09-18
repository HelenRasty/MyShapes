public class Shape {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor;
    }

    public String printArea() {
        return "Shape area is: " + ShapeUtilities.round(calcArea(), 2);
    }

    public double calcArea() {
        return 0.0;
    }
}
