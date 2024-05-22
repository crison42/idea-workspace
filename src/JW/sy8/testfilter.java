package JW.sy8;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class testfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        //获取请求头中 refer 字段的值ֵ
        String referer = req.getHeader("referer");
        //如果是浏览器直接发来的请求或其他网站转发的请求，则转发到 error.jpg
        if (referer == null || !referer.contains(request.getServerName())) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("page_1/404.html");
            dispatcher.forward(req, res);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
