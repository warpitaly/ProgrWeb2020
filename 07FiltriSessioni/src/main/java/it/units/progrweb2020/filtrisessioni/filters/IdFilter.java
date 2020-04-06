
package it.units.progrweb2020.filtrisessioni.filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author giorgio
 */
public class IdFilter implements Filter {
  
  private static final boolean debug = true;

  // The filter configuration object we are associated with.  If
  // this value is null, this filter instance is not currently
  // configured. 
  private FilterConfig filterConfig = null;
  
  public IdFilter() {
  }  
  
 

  /**
   *
   * @param request The servlet request we are processing
   * @param response The servlet response we are creating
   * @param chain The filter chain we are processing
   *
   * @exception IOException if an input/output error occurs
   * @exception ServletException if a servlet error occurs
   */
  public void doFilter(ServletRequest request, ServletResponse response,
          FilterChain chain)
          throws IOException, ServletException {
    if(request instanceof HttpServletRequest){
      HttpServletRequest httpReq = (HttpServletRequest)request;
      PrintWriter out = response.getWriter();
      String id = httpReq.getParameter("id");
      if(id == null){
        chain.doFilter(request, response);
      }else{
        if(id.length() == 0){
          //mi arrabbio!!! dovevi darmi un valore
          out.println("MALEDIZIONE! Dovevi specificare un id, non era difficile...");
        }else{
          try{
            int numericId = Integer.parseInt(id);
            if(numericId >= 0){
              chain.doFilter(request, response);
            }else{
              //mi arrabbio!!! dovevi darmi un valore >= 0
              out.println("Per toutatis! Gli id non possono essere negativi");
            }
          }catch(Exception e){
            //mi arrabbio!!! valore non numerico
            out.println("Giosafatte! questo id non è un numero, mi hai dato: " + id);
          }
        }
      }
      
    }else{
      chain.doFilter(request, response);
    }
     
  }

  /**
   * Return the filter configuration object for this filter.
   */
  public FilterConfig getFilterConfig() {
    return (this.filterConfig);
  }

  /**
   * Set the filter configuration object for this filter.
   *
   * @param filterConfig The filter configuration object
   */
  public void setFilterConfig(FilterConfig filterConfig) {
    this.filterConfig = filterConfig;
  }

  /**
   * Destroy method for this filter
   */
  public void destroy() {    
  }

  /**
   * Init method for this filter
   */
  public void init(FilterConfig filterConfig) {    
    this.filterConfig = filterConfig;
    if (filterConfig != null) {
      if (debug) {        
        log("IdFilter:Initializing filter");
      }
    }
  }

  /**
   * Return a String representation of this object.
   */
  @Override
  public String toString() {
    if (filterConfig == null) {
      return ("IdFilter()");
    }
    StringBuffer sb = new StringBuffer("IdFilter(");
    sb.append(filterConfig);
    sb.append(")");
    return (sb.toString());
  }
  
  private void sendProcessingError(Throwable t, ServletResponse response) {
    String stackTrace = getStackTrace(t);    
    
    if (stackTrace != null && !stackTrace.equals("")) {
      try {
        response.setContentType("text/html");
        PrintStream ps = new PrintStream(response.getOutputStream());
        PrintWriter pw = new PrintWriter(ps);        
        pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

        // PENDING! Localize this for next official release
        pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");        
        pw.print(stackTrace);        
        pw.print("</pre></body>\n</html>"); //NOI18N
        pw.close();
        ps.close();
        response.getOutputStream().close();
      } catch (Exception ex) {
      }
    } else {
      try {
        PrintStream ps = new PrintStream(response.getOutputStream());
        t.printStackTrace(ps);
        ps.close();
        response.getOutputStream().close();
      } catch (Exception ex) {
      }
    }
  }
  
  public static String getStackTrace(Throwable t) {
    String stackTrace = null;
    try {
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      t.printStackTrace(pw);
      pw.close();
      sw.close();
      stackTrace = sw.getBuffer().toString();
    } catch (Exception ex) {
    }
    return stackTrace;
  }
  
  public void log(String msg) {
    filterConfig.getServletContext().log(msg);    
  }
  
}
