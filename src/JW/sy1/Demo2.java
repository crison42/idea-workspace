package JW.sy1;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    static String driver="com.mysql.cj.jdbc.Driver";//驱动字符串
    static String url="jdbc:mysql://localhost:3306/bookstore?characterEncoding=utf-8";//连接字符串
    static String username="root";//数据库访问用户名
    static String password="123456";
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            //1.加载驱动
            Class.forName(driver);
            //2.建立连接
            conn= DriverManager.getConnection(url, username, password);
            //3.执行sql语句
            //利用标准输入语句来输入用户名和密码
            Scanner input=new Scanner(System.in);
            System.out.println("请输入用户名");
            String uname=input.next();
            System.out.println("请输入密码");
            String pwd=input.next();
            //preparedStatement  --begin
            String sql="select * from signon where username=? and password=?";
            ps=conn.prepareStatement(sql);//预加载方式
            //设置参数
            ps.setString(1, uname);
            ps.setString(2, pwd);
            //执行，并获得结果集
            rs=ps.executeQuery();
            //preparedStatement  --end

            boolean flag=false;
            while(rs.next())
            {
                flag=true;
            }
            if(flag)
                System.out.println("登录成功");
            else
                System.out.println("登录失败");


        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally
        {
            try {
                if(rs!=null)
                    rs.close();
                if(ps!=null)
                    ps.close();
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}