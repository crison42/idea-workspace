package JW.sy3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class categoryDaoImp extends DataBase implements categoryDao {
    @Override
    public int add(category entity) {
        String sql = "insert into category values(?,?,?,?)";
        return this.executeUpdate(sql,
                entity.getcategoryid(), entity.getCategory()
                , entity.getName(), entity.getDescn());
    }

    @Override
    public int update(category entity) {
        String sql = "update category set category=?,name=?,descn=? where categoryid=?";
        return this.executeUpdate(sql, entity.getCategory()
                , entity.getName(), entity.getDescn(),
                entity.getcategoryid());
    }

    public int delete(String pid) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM category WHERE catid = ?");
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
    public List<category> findByCatid(String catid) {
        List<category> categoryList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "username", "password");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM category WHERE catid = ?");
            statement.setString(1, catid);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                category category = new category();
                category.setPid(resultSet.getString("pid"));
                category.setName(resultSet.getString("name"));
                // 设置其他属性
                categoryList.add(category);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public List<category> findByName(String name) {
        List<category> categoryList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "123456");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM category WHERE name LIKE ?");
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                category category = new category();
                category.setPid(resultSet.getString("pid"));
                category.setName(resultSet.getString("name"));
                // 设置其他属性
                categoryList.add(category);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
    public List<category> queryAll() {
        List<category> categoryList = new ArrayList<>();

        // 假设你使用的是某个数据库连接库，比如 JDBC
        // 创建数据库连接
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "123456");

            // 创建 SQL 查询语句
            String sql = "SELECT * FROM category";

            // 创建 PreparedStatement 对象
            PreparedStatement statement = connection.prepareStatement(sql);

            // 执行查询
            ResultSet resultSet = statement.executeQuery();

            // 遍历查询结果
            while (resultSet.next()) {
                // 从结果集中获取产品的各个字段
                String id = resultSet.getString("catid");
                String name = resultSet.getString("name");
                String descn = resultSet.getString("descn");

                // 创建 category 对象并添加到 categoryList
                category cat = new category(id, name, descn);
                categoryList.add(cat);
            }

            // 关闭结果集、语句和连接
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categoryList;
    }
}