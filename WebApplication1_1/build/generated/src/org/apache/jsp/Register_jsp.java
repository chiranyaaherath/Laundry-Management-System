package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang = \"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\r\n");
      out.write("        <!--Bootstrap--> \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <style>\r\n");
      out.write("            p.heading{\r\n");
      out.write("                text-align : center;\t\r\n");
      out.write("                padding : 20px;\r\n");
      out.write("                font-size : 50px;\r\n");
      out.write("                color : orange;\r\n");
      out.write("                font-family: HeadFont;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            body{\r\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/d.jpg');\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-attachment:fixed;\r\n");
      out.write("                background-position : center center;\r\n");
      out.write("   }\r\n");
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
      out.write("  \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("                    <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"Register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("                    <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <p class = \"heading\"><b>Register Now</b></p>\r\n");
      out.write("\r\n");
      out.write("        <form class = \"form_design\"  action = \"register\" method = \"post\">\r\n");
      out.write("\r\n");
      out.write("            <div class = \"start_login\">\r\n");
      out.write("\r\n");
      out.write("                  <label for = \"name\" style = \"font-size:30px; color:#F5FFFA;\">Name</label>\r\n");
      out.write("                <input type = \"text\" placeholder = \"Enter Name\" name = \"name\" required>\r\n");
      out.write("                \r\n");
      out.write("                  <label for = \"nic\" style = \"font-size:30px; color:#F5FFFA;\"> NIC number</label>\r\n");
      out.write("                <input type = \"text\" placeholder = \"Enter NIC number\" name = \"nic\" required><br><br>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <label for = \"mobile\" style = \"font-size:30px; color:#F5FFFA;\">Mobile Number</label>\r\n");
      out.write("                <input type = \"text\" placeholder = \"Enter mobile number\" name = \"mobile\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                <label for = \"u_name\" style = \"font-size:30px; color:#F5FFFA;\">Username</label>\r\n");
      out.write("                <input type = \"text\" placeholder = \"Enter username\" name = \"u_name\" required>\r\n");
      out.write("\r\n");
      out.write("                <label for = \"pass\" style = \"font-size:30px; color:#F5FFFA;\">Password</label>\r\n");
      out.write("                <input type = \"password\" placeholder = \"Enter password\" name = \"pass\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <button type = \"submit\" class=\"btn btn-primary\" name = \"user-register\" style=\"font-size: 20px; width: 50%;\"><b>Register</b></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
