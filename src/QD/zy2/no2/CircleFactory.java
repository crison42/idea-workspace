package QD.zy2.no2;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
