package QD.zy2.no3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("======软工2213班常洪的创建不同几何图形-简单工厂答案======");
        ShapeFactory shapeFactory;
        Shape shape;
        shapeFactory=(ShapeFactory)PropertiesUtil.getBean();
        shape=shapeFactory.createShape();
        shape.draw();
        shape.erase();
    }
}
