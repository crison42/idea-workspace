package QD.zy2.no1;

public class Client {
    public static void main(String[] args) {
        System.out.println("======软工2213班常洪的创建不同几何图形-简单工厂答案======");
        System.out.println("圆形、矩形、三角形对应的参数分别是：Circle、Rectangle和Triangle");
//        Scanner sc = new Scanner(System.in);
//        String product=sc.next();
//        Shape shape = SimpleFactory.product(product);
        Shape shape = SimpleFactory.product("Circle");
        shape.draw();
        shape.erase();
    }
}
