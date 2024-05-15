package JW.sy7;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request,
     * HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {
        System.out.println("SecondServlet--->>> 进入 doGet 方法，交由 doPost 方法处理...");
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request,
     * HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {
        System.out.println("SecondServlet--->>> 执行 POST 请求...");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>这是 SecondServlet 中的响应数据</h1>");
        pw.flush();
        pw.close();
    }
}