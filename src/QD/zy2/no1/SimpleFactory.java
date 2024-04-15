package QD.zy2.no1;

public class SimpleFactory {
    public static Shape product(String shapeString) {
        while (true) {
            if (shapeString.equals("Circle")) {
                return new Circle();
            } else if (shapeString.equals("Rectangle")) {
                return new Rectangle();
            } else if (shapeString.equals("Triangle")) {
                return new Triangle();
            } else {
                System.out.println("请重新输入");
            }
        }
    }
}
