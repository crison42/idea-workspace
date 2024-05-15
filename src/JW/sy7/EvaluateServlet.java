package JW.sy7;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/evaluate")
public class EvaluateServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取请求参数
        String r1 = request.getParameter("r1");
        String[] c1 = request.getParameterValues("c1");
        String[] list1 = request.getParameterValues("list1");
        String list2 = request.getParameter("list2");
        String text1 = request.getParameter("text1");

        // 处理请求参数并输出结果
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("一、解答为：2+3=" + r1 + " ");
        if (r1 != null && r1.equals("5")) {
            response.getWriter().println("正确！" + "<br>");
        } else {
            response.getWriter().println("错误！" + "<br>");
        }
        response.getWriter().println("----------------------");

        if (c1 != null) {
            response.getWriter().print("二、解答为：偶数有：");
            for (String s : c1) {
                response.getWriter().println(s + " ");
            }
            if (c1.length == 2 && c1[0].equals("2") && c1[1].equals("4")) {
                response.getWriter().println("正确！" + "<br>");
            } else {
                response.getWriter().println("错误！" + "<br>");
            }
        } else {
            response.getWriter().println("二、没有解答！" + "<br>");
        }
        response.getWriter().println("----------------------");

        if (list1 != null) {
            response.getWriter().print("三、解答为：动态网页有：");
            for (String s : list1) {
                response.getWriter().println(s + " ");
            }
            if (list1.length == 3 && list1[0].equals("asp") && list1[1].equals("php") && list1[2].equals("jsp")) {
                response.getWriter().println("正确！" + "<br>");
            } else {
                response.getWriter().println("错误！" + "<br>");
            }
        } else {
            response.getWriter().println("三、没有解答！");
        }
        response.getWriter().println("----------------------");

        if (list2 != null) {
            response.getWriter().print("四、解答为：服务器端的组件是有：");
            response.getWriter().println(list2 + " ");
            if (list2.equals("servlet")) {
                response.getWriter().println("正确！" + "<br>");
            } else {
                response.getWriter().println("错误！" + "<br>");
            }
        } else {
            response.getWriter().println("四、没有解答！");
        }
        response.getWriter().println("----------------------");

        if (text1 != null) {
            response.getWriter().print("五、解答为：在服务器端用来接受用户请求的对象是 ：");
            response.getWriter().println(text1 + " ");
            if (text1.equals("request")) {
                response.getWriter().println("正确！" + "<br>");
            } else {
                response.getWriter().println("错误！" + "<br>");
            }
        } else {
            response.getWriter().println("五、没有解答！");
        }
        response.getWriter().println("----------------------");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}

