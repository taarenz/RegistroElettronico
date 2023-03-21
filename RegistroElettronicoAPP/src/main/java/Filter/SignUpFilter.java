package Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "SignUpFilter",urlPatterns = {"/SignUpServlet"})
public class SignUpFilter implements Filter {

    private FilterConfig filterConfig = null;

    public SignUpFilter() {

    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig=config;
    }

    public void destroy() {
        filterConfig=null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse resp=(HttpServletResponse) response;

        //controllo user già esistente db
        if () {
            resp.sendRedirect("login.jsp");
        }
        else {
            chain.doFilter(request, response);
            resp.sendRedirect("homePage.jsp");
        }
    }
}
