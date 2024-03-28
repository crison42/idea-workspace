package QD.t3.no2;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画三角形");
    }

    @Override
    public void erase() {
        System.out.println("删除三角形");
    }
}
