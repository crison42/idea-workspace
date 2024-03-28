package QD.t3.no2;

public class TriangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
