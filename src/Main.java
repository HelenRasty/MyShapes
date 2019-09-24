import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double sumArea = 0.0;
        double sumRectArea = 0.0;
        double sumTriangleArea = 0.0;
        double sumCircleArea = 0.0;

        System.out.println("----------------------------------------TASK #2: ----------------------------------------");
        Circle myCircle = new Circle("green", 10.0);
        System.out.println(myCircle.toString() + ". " + myCircle.printArea());

        System.out.println("----------------------------------------TASK #3: ----------------------------------------");
        Rectangle myRectangle = new Rectangle("red", 11, 22);
        System.out.println(myRectangle.toString() + ". " + myRectangle.printArea());

        System.out.println("----------------------------------------TASK #4: ----------------------------------------");
        Triangle myTriangle = new Triangle("black", 5, 5, 5);
        System.out.println(myTriangle.toString() + ". " + myTriangle.printArea());

        System.out.println("----------------------------------------TASK #5: ----------------------------------------");
        Shape[] myShapes = {
                new Rectangle("rose", 4, 2),
                new Rectangle("orange", 3, 8),
                new Rectangle("dark blue", 28, 10),
                new Rectangle("white", 13, 50),
                new Rectangle("red", 4, 18),
                new Circle("violet", 14),
                new Circle("light blue", 39),
                new Triangle("yellow", 13, 13, 22),
                new Triangle("pink", 28, 10, 30)};

        Arrays.sort(myShapes);
        for (Shape myShape : myShapes) {
            sumArea = sumArea + myShape.calcArea();

            if (myShape instanceof Circle) {
                sumCircleArea = sumCircleArea + myShape.calcArea();
            }
            if (myShape instanceof Rectangle) {
                sumRectArea = sumRectArea + myShape.calcArea();
            }
            if (myShape instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + myShape.calcArea();
            }
            myShape.draw();
        }

        System.out.println();
        System.out.println("Total area for all shapes is: " + ShapeUtilities.round(sumArea, 2));
        System.out.println();
        System.out.println("Rectangles total area is: " + ShapeUtilities.round(sumRectArea, 2) +
                ", Circles total area is: " + ShapeUtilities.round(sumCircleArea, 2) +
                ", Triangles total area is: " + ShapeUtilities.round(sumTriangleArea, 2) +
                ".");

        System.out.println("----------------------------------------TASK #4 from 12 lesson: ----------------------------------------");
        Arrays.sort(myShapes, new ColorComparator());
        for (Shape myShape : myShapes) {
            myShape.draw();
        }
    }
}
