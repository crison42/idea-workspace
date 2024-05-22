package JW.sy8;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class testfilter3 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        req.setCharacterEncoding("utf-8");
        chain.doFilter(new MyRequest(req), res);
    }

    public void destroy() {
    }

    public void init(FilterConfig fConfig) {
    }
}

class MyRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;

    public MyRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    public String getParameter(String name) {
        if ("info".equals(name)) {
            String info = request.getParameter(name);
            String[] strings = {"dnf", "神碑"};
            for (String string : strings) {
                info = info.replace(string, "**");
            }
            return info;
        }
        return request.getParameter(name);
    }
}