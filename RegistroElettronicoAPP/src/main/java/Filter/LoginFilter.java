package Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "LoginFilter",urlPatterns = {"/LoginServlet"})
public class LoginFilter implements Filter {

    private FilterConfig filterConfig = null;

    public LoginFilter() {
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

    public void destroy() {
        this.filterConfig = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse resp=(HttpServletResponse) response;

        //controllo user db
        if () {
            chain.doFilter(request, response);
        }
        else {
            resp.sendRedirect("signUp.jsp");
        }
    }
}
