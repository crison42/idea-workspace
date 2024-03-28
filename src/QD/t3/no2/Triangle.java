package QD.t3.no2;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画矩形");
    }

    @Override
    public void erase() {
        System.out.println("删除矩形");
    }
}
