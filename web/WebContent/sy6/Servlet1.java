package JW.sy6;

import JW.sy2.Signon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Servlet1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("username", "abc");// 存储字符串类型到 Session 作用域
        session.setAttribute("age", 18);// 存储基本类型到 Session 作用域
        Signon signon = new Signon();
        signon.setUsername("rose");
        signon.setPassword("1234");
        session.setAttribute("user", signon);// 存储对象到 Session 作用域
        String uname[] = {"tom", "jack"};
        request.setAttribute("uname", uname);// 存储数组到 request 作用域
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("uname", "tom");
        map.put("pwd", "1234");
        request.setAttribute("map", map);// 存储 map 集合到 request 作用域
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火",
                1));
        brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
        brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
        request.setAttribute("brands", brands);// 存储 list 集合到 request 作用域
        HashMap<String, Brand> map1 = new HashMap<String, Brand>();
        map1.put("1", new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
        map1.put("2", new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
        map1.put("3", new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
        request.setAttribute("map1", map1);// 存储 map 集合到 request 作用域
        //转发到 el-demo.jsp
        request.getRequestDispatcher("/el-demo1.jsp").forward(request, response);
    }
}
