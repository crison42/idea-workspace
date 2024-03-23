package JW.sy1;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {
    static String driver="com.mysql.cj.jdbc.Driver";//驱动字符串
    static String url="jdbc:mysql:///bookstore?characterEncoding=utf-8";//连接字符串
    /**
     1.jdbc:mysql:///bookstore?characterEncoding=utf-8
     2.jdbc:mysql://localhost:3306/bookstore?characterEncoding=utf-8
     3.jdbc:mysql://127.0.0.1:3306/bookstore?characterEncoding=utf-8
     */
    static String username="root";//数据库访问用户名
    static String password="123456";
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
            sm=conn.createStatement();
            //利用标准输入语句来输入用户名和密码
            Scanner input=new Scanner(System.in);
            System.out.println("请输入用户名");
            String uname=input.next();
            System.out.println("请输入密码");
            String pwd=input.next();
            //1' or '1'='1
            String sql="select * from signon where username='"+uname+"' and password='"+pwd+"'";//利用拼接字符串写入变量
            //获取结果集
            rs=sm.executeQuery(sql);
            boolean flag=false;
            while(rs.next())
            {
                flag=true;
            }
            if(flag)
                System.out.println("登录成功");
            else
                System.out.println("登录失败");


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            try {
                if(rs!=null)
                    rs.close();
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