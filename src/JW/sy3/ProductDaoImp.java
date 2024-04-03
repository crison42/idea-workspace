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
            PreparedStatement statement = connection.prepareStatement("DELETE FROM products WHERE pid = ?");
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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE catid = ?");
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
    
}