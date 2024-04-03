package JW.sy3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImp extends DataBase implements ProductDao {
    @Override
    public int add(Product entity) {
        String sql = "insert into product values(?,?,?,?)";
        return this.executeUpdate(sql,
                entity.getProductid(), entity.getCategory()
                , entity.getName(), entity.getDescn());
    }

    @Override
    public int update(Product entity) {
        String sql = "update product set category=?,name=?,descn=? where productid=?";
        return this.executeUpdate(sql, entity.getCategory()
                , entity.getName(), entity.getDescn(),
                entity.getProductid());
    }

    public int delete(String pid) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM product WHERE productid = ?");
            statement.setString(1, pid);
            int rowsDeleted = statement.executeUpdate();
            connection.close();
            return rowsDeleted;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Product> findByCatid(String catid) {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "username", "password");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM product WHERE category = ?");
            statement.setString(1, catid);
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

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "123456");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM product WHERE name LIKE ?");
            statement.setString(1, "%" + name + "%");
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
    public List<Product> queryAll() {
        List<Product> productList = new ArrayList<>();

        // 假设你使用的是某个数据库连接库，比如 JDBC
        // 创建数据库连接
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "123456");

            // 创建 SQL 查询语句
            String sql = "SELECT * FROM product";

            // 创建 PreparedStatement 对象
            PreparedStatement statement = connection.prepareStatement(sql);

            // 执行查询
            ResultSet resultSet = statement.executeQuery();

            // 遍历查询结果
            while (resultSet.next()) {
                // 从结果集中获取产品的各个字段
                String id = resultSet.getString("productid");
                String name = resultSet.getString("name");
                String category = resultSet.getString("category");

                // 创建 Product 对象并添加到 productList
                Product product = new Product(id, name, category);
                productList.add(product);
            }

            // 关闭结果集、语句和连接
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }
}