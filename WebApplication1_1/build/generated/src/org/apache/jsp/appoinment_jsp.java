package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class appoinment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang = \"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\r\n");
      out.write("        <!--Bootstrap--> \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <title>Make Appointments</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <style>   p.heading{\r\n");
      out.write("                text-align : center;\t\r\n");
      out.write("                padding : 20px;\r\n");
      out.write("                font-size : 50px;\r\n");
      out.write("                color : orange;\r\n");
      out.write("                font-family: HeadFont;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            body{\r\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/c1.jpg');\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-attachment:fixed;\r\n");
      out.write("                background-position : center center;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=text], input[type=password], input[type=email] {\r\n");
      out.write("                width: 90%;\r\n");
      out.write("                padding: 5px 2px;\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("            } \r\n");
      out.write("\r\n");
      out.write("            .start_login{\r\n");
      out.write("                padding: 16px;\r\n");
      out.write("                text-align : center;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form_design{\r\n");
      out.write("                margin : 3% 30% 0% 35%;\r\n");
      out.write("                width  : 30%;\r\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.6), rgba(0,0,0,.6));\r\n");
      out.write("                border: 1px solid blueviolet;\r\n");
      out.write("                border-radius: 40px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            *{\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @font-face {\r\n");
      out.write("                font-family: NavFont;\r\n");
      out.write("                src: url(Fonts/fon4.otf);\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            @font-face{\r\n");
      out.write("                font-family: TextFont;\r\n");
      out.write("                src: url(Fonts/font1.otf);;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @font-face {\r\n");
      out.write("                font-family: HeadFont;\r\n");
      out.write("                src: url(Fonts/font2.otf);\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li><a href=\"Index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"viewAppoinments.jsp\">Appoinments</a></li>\r\n");
      out.write("                    <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"Register.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("                    <li><a href=\"Login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <p class = \"heading\"><b>Make An Appoinment</b></p>\r\n");
      out.write("\r\n");
      out.write("        <form class = \"form_design\"  action = \"appoinment\" method = \"post\">\r\n");
      out.write("\r\n");
      out.write("            <div class = \"start_login\">\r\n");
      out.write("\r\n");
      out.write("                <label for = \"mail\" style = \"font-size:30px; color:#F5FFFA;\">Doctor</label>\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <select name=\"doctor\">\r\n");
      out.write("                        ");
 try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/echanneling", "root", "");
                                String query = "select DISTINCT(fname) from doctor";
                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery(query);

                                while (rs.next()) {

                        
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(rs.getString("fname"));
      out.write("\">\r\n");
      out.write("                            ");
      out.print(rs.getString("fname"));
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                        </option>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
 }
                            } catch (Exception e) {
                                out.println(e.getMessage());
                            }
                        
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("\r\n");
      out.write("                    <label for = \"u_name\" style = \"font-size:30px; color:#F5FFFA;\">Date</label>\r\n");
      out.write("                    <input type = \"date\" placeholder = \"Enter username\" name = \"date\" required><br>\r\n");
      out.write("\r\n");
      out.write("                    <label for = \"pass\" style = \"font-size:30px; color:#F5FFFA;\">Time</label>\r\n");
      out.write("                    <select name=\"time\">\r\n");
      out.write("                        <option>8 AM</option>\r\n");
      out.write("                        <option>4 PM</option>\r\n");
      out.write("                        <option>8 PM</option>\r\n");
      out.write("                    </select><br><br>\r\n");
      out.write("\r\n");
      out.write("                    <button type = \"submit\" class=\"btn btn-primary\" name = \"user-register\" style=\"font-size: 20px; width: 50%;\"><b>Make Appoinment</b></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("                  ");
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
