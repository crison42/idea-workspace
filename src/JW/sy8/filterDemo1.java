package JW.sy8;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

@WebFilter(value = "/index.jsp")
public class filterDemo1 implements Filter {

    public filterDemo1() {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("filterDemo1()");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filterDemo1 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤前：1.FilterDemo ...");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("过滤后：2.FilterDemo back ...");
    }

    @Override
    public void destroy() {
        System.out.println("filterDemo1 destroy");
    }
}
