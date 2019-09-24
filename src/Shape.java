public abstract class Shape implements Drawable, Comparable {

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

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(toString() + " area is: " + ShapeUtilities.round(calcArea(), 2));
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;

        if (this.calcArea() < shape.calcArea())
            return -1;
        if (this.calcArea() > shape.calcArea())
            return 1;
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}