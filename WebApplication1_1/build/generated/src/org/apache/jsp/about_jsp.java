package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\n");
      out.write("        <!--Bootstrap--> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
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
      out.write("                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/d.jpg');\n");
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
      out.write("\n");
      out.write("        </style>\n");
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
      out.write("         <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"customer.jsp\">Home</a></li>\n");
      out.write("                     <li><a href=\"add.jsp\">Add Orders</a></li>\n");
      out.write("                     <li><a href=\"my.jsp\">My Orders</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About Us</a></li> \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                     <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("        <h2 style=\"color: white;\">\n");
      out.write("            <center>About Us</center>\n");
      out.write("        </h2>\n");
      out.write("          \n");
      out.write(" <p>\n");
      out.write("We trust the best laundry benefit rests at the crossing point of form and way of life. Laundry is in excess of a necessary chore; the correct laundry benefit causes you express your style with certainty. That is the reason at ?Clean Me? , we esteem modifying our administrations to clients? needs regardless of anything else.\n");
      out.write("\n");
      out.write("Not at all like an application based administration, at ?Clean Me? you can talk eye to eye with a laundry authority keen on becoming more acquainted with you and your way of life needs.\n");
      out.write("\n");
      out.write("\n");
      out.write("?Clean Me? was established by Rose Keeth in 2008. As a bustling youthful expert juggling a frenzied promoting occupation and her own life, Rose was baffled with questionable laundry administrations who declined to take individual solicitations. Motivated by her laundry hardships, Lucy opened the main ?Organization Name? area in NoHo.\n");
      out.write("\n");
      out.write("Since 2008, ?Organization Name? has developed from a corner organization name to a one-stop piece of clothing shop pulling in any semblance of beauticians, mold planners, celebs, bloggers and that?s only the tip of the iceberg.\n");
      out.write("\n");
      out.write("No longer an area mystery, ?Organization Name? has routinely acknowledged business customers since its first, the Mercer Hotel, in 2010. However, in the case of working for an area nearby or a major business, ?Organization Name? keeps on keeping flawless administration as its center.\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
