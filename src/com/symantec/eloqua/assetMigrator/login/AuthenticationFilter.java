package com.symantec.eloqua.assetMigrator.login;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {    
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(false);
       
        
        // get requested page uri
        String uri = ((HttpServletRequest)request).getRequestURI();

        // this pages can be accessed without authentication
        String loginURI = req.getContextPath() + "/login.jsp";
        String errorPage = req.getContextPath() + "/errorPage.jsp";
        String loginServlet = req.getContextPath() + "/Authenticate";

        boolean loggedIn = session != null && session.getAttribute("userName") != null;
        boolean loginRequest = req.getRequestURI().equals(loginURI);
        boolean errorRequest = req.getRequestURI().equals(errorPage);
        boolean loginServletRequest = req.getRequestURI().equals(loginServlet);

        // check page uri and forward to right page
        if (loggedIn || loginServletRequest || loginRequest || errorRequest || (uri.matches(".*(css|jpg|png|gif|js)"))) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect(loginURI);
        }

    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
