package QD.t3.no3;

public class Client {
    public static void main(String[] args) {
        System.out.println("======软工2213班常洪的创建不同几何图形-简单工厂答案======");
//        System.out.println("圆形、矩形、三角形对应的参数分别是：Circle、Rectangle和Triangle");
        ShapeFactory shapeFactory;
        Shape shape;
//        Scanner sc = new Scanner(System.in);
//        String product=sc.next();
//if (product.equals("Circle")){
//    shapeFactory=new CircleFactory();
//} else if (product.equals("Rectangle")) {
//    shapeFactory=new RectangleFactory();
//} else if (product.equals("Triangle")) {
//    shapeFactory=new TriangleFactory();
//}
        shapeFactory = new CircleFactory();
        shape = shapeFactory.createShape();
        shape.draw();
        shape.erase();
    }
}
