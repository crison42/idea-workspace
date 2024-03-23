package JW.sy1;

import java.sql.*;

public class Demo3 {
    static String driver="com.mysql.cj.jdbc.Driver";//驱动字符串
    static String url="jdbc:mysql:///bookstore?characterEncoding=utf-8";//连接字符串
    static String username="root";//数据库访问用户名
    static String password="root";
    public static void main(String[] args) {
        Connection conn=null;
        Statement sm=null;
        ResultSet rs=null;
        try {
            //1.加载驱动
            Class.forName(driver);
            //2.建立连接
            conn= DriverManager.getConnection(url, username, password);
            //3.执行sql语句
            //引入事务机制进行增加
            //事务第一步
            sm=conn.createStatement();
            conn.setAutoCommit(false);//设置手动提交
            String sql1="insert into signon values('demo2','demo2')";
            String sql2="insert into account(userid,email) values('demo1','121122121')";
            sm.executeUpdate(sql1);
            sm.executeUpdate(sql2);
            //事务第二步  手动提交
            conn.commit();
            System.out.println("插入成功");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            //进行回滚
            try {
                System.out.println("插入失败进行回滚");
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
        finally
        {
            try {
                if(sm!=null)
                    sm.close();
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}