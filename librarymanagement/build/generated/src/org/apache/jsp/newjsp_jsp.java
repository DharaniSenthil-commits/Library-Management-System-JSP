package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"frm\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"4\" align=\"center\">STUDENT ENROLEMENT</td>\n");
      out.write("\t</tr>\n");
      out.write("\t\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>NAME</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"txtName\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>AGE</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"txtAge\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\t\n");
      out.write("\t<tr>\n");
      out.write("            <td colspan=\"4\" align=\"center\"><input type=\"Submit\" name=\"btnSubmit\" value=\"Submit\"></td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

   
    Class.forName("com.mysql.jdbc.Driver");
     Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/libdb","root","");
     Statement st=cn.createStatement();
    String btn=request.getParameter("btnSubmit");
    if ( btn !=null)
    {
       String n=request.getParameter("txtName");
       String a=request.getParameter("txtAge");
      String q="insert into tb(name,age) values ('"+n+"','"+a+"')";
       int z=st.executeUpdate(q);
      out.println("<h1>inserted</h1>");
      // response.sendRedirect("login.jsp");
    }

   // catch(Exception e)
    else
            {
            System.out.println("something went wrong");
            }
      
      out.write('\n');
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
