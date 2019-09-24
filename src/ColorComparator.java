import java.util.Comparator;

public class ColorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;

        String shape1Color = shape1.getShapeColor();
        String shape2Color = shape2.getShapeColor();

        return shape1Color.compareTo(shape2Color);
    }
}
