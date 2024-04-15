package QD.zy2.no2;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
