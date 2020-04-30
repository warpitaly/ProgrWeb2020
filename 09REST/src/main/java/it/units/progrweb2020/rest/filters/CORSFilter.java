package it.units.progrweb2020.rest.filters;

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

/**
 *
 * @author giorgio
 */
@WebFilter(asyncSupported = true, urlPatterns = {"/api/*"})
public class CORSFilter implements Filter{

  public CORSFilter() {
  }

  public void init(FilterConfig filterConfig) throws ServletException {
    
  }

  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse)servletResponse;
    
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST, DELETE");
    response.addHeader("Access-Control-Max-Age", "3600");
    response.addHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With, Accept-Charset");

    if(request.getMethod().equals("OPTIONS")){
      response.setStatus(HttpServletResponse.SC_ACCEPTED);
    }else{
      chain.doFilter(request, response);
    }
  }

  public void destroy() {
    
  }
  
  
}
