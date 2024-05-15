package JW.sy7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("FirstServlet--->>> 进入 doGet 方法，交由 doPost 方法处理...");
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("FirstServlet--->>> 执行 POST 请求...");
        // 转发到 second.jsp，使用相对路径
        //request.getRequestDispatcher("second.jsp").forward(request, response);
        // 重定向到 second.jsp
//response.sendRedirect(request.getContextPath()+"/second.jsp");
        // 重定向到 second.jsp，使用相对路径
        //response.sendRedirect("second.jsp");
        // 转发到 SecondServlet，使用相对路径
//request.getRequestDispatcher("SecondServlet").forward(request, response);
        // 重定向到 SecondServlet，
//response.sendRedirect(request.getContextPath()+"/SecondServlet");
        // 重定向到 SecondServlet，使用相对路径
        response.sendRedirect("SecondServlet");
    }
}