package JW.sy7;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serial;
import java.nio.charset.StandardCharsets;

/**
 * Servlet implementation class Test01
 */
@WebServlet("/Test01")
public class Test01 extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test01() {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("servlet 创建了");
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) {
        System.out.println("servlet 初始化 了");
    }

    /**
     * @see Servlet#destroy()
     */
    public void destroy() {
        System.out.println("servlet 销毁了");
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request,
     * HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws
            IOException {
        PrintWriter out = response.getWriter();
        out.print("this is get method");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request,
     * HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws
            IOException {
        PrintWriter out = response.getWriter();
        out.print("this is post method");
    }
}