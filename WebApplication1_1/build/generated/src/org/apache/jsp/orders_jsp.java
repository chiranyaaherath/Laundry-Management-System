package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\n");
      out.write("        <!--Bootstrap--> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Register</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            p.heading{\n");
      out.write("                text-align : center;\t\n");
      out.write("                padding : 20px;\n");
      out.write("                font-size : 50px;\n");
      out.write("                color : orange;\n");
      out.write("                font-family: HeadFont;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/a.jpg');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment:fixed;\n");
      out.write("                background-position : center center;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("            input[type=text], input[type=password], input[type=email] {\n");
      out.write("                width: 90%;\n");
      out.write("                padding: 5px 2px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            .start_login{\n");
      out.write("                padding: 16px;\n");
      out.write("                text-align : center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form_design{\n");
      out.write("                margin : 3% 30% 0% 35%;\n");
      out.write("                width  : 30%;\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.6), rgba(0,0,0,.6));\n");
      out.write("                border: 1px solid blueviolet;\n");
      out.write("                border-radius: 40px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @font-face {\n");
      out.write("                font-family: NavFont;\n");
      out.write("                src: url(Fonts/fon4.otf);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            @font-face{\n");
      out.write("                font-family: TextFont;\n");
      out.write("                src: url(Fonts/font1.otf);;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @font-face {\n");
      out.write("                font-family: HeadFont;\n");
      out.write("                src: url(Fonts/font2.otf);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            td,th{\n");
      out.write("                background-color:w; \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          ");

    if(session.getAttribute("username")== null){
        response.sendRedirect("index.html");
    }
    
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"orders.jsp\">Orders</a></li>\n");
      out.write("                    <li><a href=\"cleaning.jsp\">Cleaning</a></li>\n");
      out.write("                    <li><a href=\"store.jsp\">Store</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"delivery.jsp\">Delivery</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"1\" class=\"table table-hover\" style=\"  color: white;width: 80%;\">\n");
      out.write("<tr>\n");
      out.write("    <th >Name</th>\n");
      out.write("<th>Location</th>\n");
      out.write("<th>Weight</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("  ");
  try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");

                    ResultSet rs = con.createStatement().executeQuery("SELECT * FROM orders");
                    while (rs.next()) {
                        String user = rs.getString("name");
                        String location = rs.getString("location");
                        int weight = rs.getInt("weight");
                     
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(user);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(location);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(weight);
      out.write("</td>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      \n");
      out.write(" ");
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
