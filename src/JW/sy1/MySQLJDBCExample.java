package JW.sy1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLJDBCExample {

    public static void main(String[] args) {
        // 数据库连接字符串
        String url = "jdbc:mysql://localhost:3306/bookstore";
        String user = "root";
        String password = "123456";

        try {
            // 加载MySQL JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 建立数据库连接
            Connection conn = DriverManager.getConnection(url, user, password);

            // 创建Statement对象
            Statement stmt = conn.createStatement();

            // 执行SQL查询
            ResultSet rs = stmt.executeQuery("SELECT * FROM bookstore.signon;");

            // 遍历结果集
            while (rs.next()) {
                // 获取每行的数据
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rowData.length; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                // 输出数据
                for (Object data : rowData) {
                    System.out.print(data + " ");
                }
                System.out.println();
            }

            // 关闭资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
