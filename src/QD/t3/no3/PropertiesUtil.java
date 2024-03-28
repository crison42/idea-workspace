package QD.t3.no3;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class PropertiesUtil {
    public static Object getBean() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\QD\\t3\\no3\\ShapeFactory.properties"));
        String property = properties.getProperty("classname");
        return Class.forName(property).getConstructor().newInstance();
    }
}
