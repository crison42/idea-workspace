package JW.sy7;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serial;

/**
 * Servlet implementation class Test02
 */
public class Test02 extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test02() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request,
     * HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) {
        ServletConfig config = this.getServletConfig();
        String s = config.getInitParameter("uname");
        System.out.println(s);
        ServletContext context = this.getServletContext();
        String driver = context.getInitParameter("driver");
        System.out.println(driver);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request,
     * HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) {
// TODO Auto-generated method stub
        doGet(request, response);
    }
}