package JW.sy8;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/index.jsp")
public class filterDemo2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter2 doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("MyFilter2 doFilter 2");
    }

    @Override
    public void destroy() {

    }
}
