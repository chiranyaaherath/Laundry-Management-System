package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewAppoinments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Appointments</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Patient</th>\n");
      out.write("                <th>Doctor</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Time</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
  try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/echanneling", "root", "");

                    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM appoinment");
                    while (rs.next()) {
                        String user = rs.getString("user");
                        String doctor = rs.getString("doctor");
                        String date = rs.getString("date");
                        String time = rs.getString("time");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(user);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(doctor);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(date);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(time);
      out.write("</td>\n");
      out.write("                <td><form action=\"deleteAction\"><input type=\"text\" name=\"user\" value=\"");
      out.print(user);
      out.write("\" hidden=\"hidden\"><input type=\"submit\" value=\"Delete\"></form></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
