package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;

public final class stud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title> libmag</title>   \n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"lib2.css\">\n");
      out.write("          \n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"frm\" method=\"post\">\n");
      out.write("        <div id=\"bg\">\n");
      out.write("\t       \n");
      out.write("\t              <div id=\"header\">\n");
      out.write("\t                    <h1> LIBRARY MANAGEMENT SYSTEM</h1>\n");
      out.write("\t              </div>\n");
      out.write("                        <div id=\"nav\">\n");
      out.write("                                   \n");
      out.write("                                                 <a href=\"index.jsp\">HOME</a>\n");
      out.write("                                                 \n");
      out.write("                                                \n");
      out.write("                        </div>\n");
      out.write("\t                <div id=\"content\">\n");
      out.write("                                 <div id=\"frm\">\n");
      out.write("                                \n");
      out.write("                                   <table align=\"center\" cellspacing=\"10\" cellpadding=\"5\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td colspan=\"4\" align=\"center\">RETURN</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <td>ROLL NO</td>\n");
      out.write("                                                <td><input type=\"text\" name=\"rollno\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                             <td colspan=\"4\" align=\"center\">\n");
      out.write("                                          <input type=\"submit\" value=\"check\" onclick=\"window.location.href='checkstud.jsp'\" />\n");
      out.write("                                                 </tr>\n");
      out.write("\n");
      out.write("                                     \n");
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
