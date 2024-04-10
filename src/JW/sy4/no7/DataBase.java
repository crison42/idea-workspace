package JW.sy4.no7;

import JW.sy3.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    static String url = "jdbc:mysql://localhost:3306/bookstore";
    static String user = "root";
    static String password = "123456";
    static String driverClass = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;
	
	/*public DataBase(){
		try {
			
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

    public void getConnection() {

        try {
            if (con == null || con.isClosed())
                con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int executeUpdate(String sql, Object... args) {
        int result = 0;
        getConnection();
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            result = ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }

    public ResultSet executeQuery(String sql, Object... args) {
        getConnection();
        rs = null;
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public void close() {

        try {
            if (rs != null) {
                rs.close();
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public List<Product> findByCatidFenye(String catid, int pageNum, int pageSize) {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "123456");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM product WHERE productid = ? LIMIT ?, ?");
            statement.setString(1, catid);
            statement.setInt(2, (pageNum - 1) * pageSize);
            statement.setInt(3, pageSize);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setPid(resultSet.getString("pid"));
                product.setName(resultSet.getString("name"));
                // 设置其他属性
                productList.add(product);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

}
