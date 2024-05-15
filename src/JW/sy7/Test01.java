package JW.sy7;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

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
     * @see HttpServlet#service(HttpServletRequest request,
     * HttpServletResponse response)
     */
    protected void service(ServletRequest servletRequest,
                           HttpServletResponse servletResponse) throws
            IOException {
        HttpServletRequest request = (HttpServletRequest)
                servletRequest;
        HttpServletResponse response = servletResponse;
        System.out.println("servlet 服务启动了");
        String method = request.getMethod();
        if ("get".equalsIgnoreCase(method))
            this.doGet(request, response);
        else if ("post".equalsIgnoreCase(method))
            this.doPost(request, response);
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