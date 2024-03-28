package QD.t3.no1;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("删除圆形");
    }
}
