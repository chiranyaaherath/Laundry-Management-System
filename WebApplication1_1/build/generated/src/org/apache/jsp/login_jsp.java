package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <!-- Meta tags -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Gaze Sign up & login Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\"\n");
      out.write("              />\n");
      out.write("        <script>\n");
      out.write("            addEventListener(\"load\", function () {\n");
      out.write("                setTimeout(hideURLbar, 0);\n");
      out.write("            }, false);\n");
      out.write("            function hideURLbar() {\n");
      out.write("                window.scrollTo(0, 1);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Meta tags -->\n");
      out.write("        <!--stylesheets-->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\">\n");
      out.write("        <!--//style sheet end here-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mid-class\">\n");
      out.write("            <div class=\"art-right-w3ls\">\n");
      out.write("                <h2>Login</h2>\n");
      out.write("                <form action=\"login\" method=\"post\">\n");
      out.write("                    <div class=\"main\">\n");
      out.write("                        <div class=\"form-left-to-w3l\">\n");
      out.write("                            <input type=\"text\" name=\"username\" placeholder=\"Username\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-left-to-w3l \">\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"left-side-forget\">\n");
      out.write("                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                        <span class=\"remenber-me\">Remember me </span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right-side-forget\">\n");
      out.write("                        <a href=\"#\" class=\"for\">Forgot password...?</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                    <div class=\"btnn\">\n");
      out.write("                        <button type=\"submit\">Sign In</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"w3layouts_more-buttn\">\n");
      out.write("                    <h3>Don't Have an account..?\n");
      out.write("                        <a href=\"Register.jsp\">Sign Up Here\n");
      out.write("                        </a>\n");
      out.write("                    </h3>\n");
      out.write("                </div>\n");
      out.write("                <!-- popup-->\n");
      out.write("                <div id=\"content1\" class=\"popup-effect\">\n");
      out.write("                    <div class=\"popup\">\n");
      out.write("\n");
      out.write("                        <!--//login form-->\n");
      out.write("                        <a class=\"close\" href=\"#\">&times;</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- //popup -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"art-left-w3ls\">\n");
      out.write("                <h1 class=\"header-w3ls\">\n");
      out.write("                    A better place to do your laundry\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"bottem-wthree-footer\">\n");
      out.write("\n");
      out.write("            <p class=\"copyright-text\" style=\"text-align: center;\">Copyright &copy; 2020 All Rights Reserved by \n");
      out.write("                <a href=\"#\">Clean Me</a>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
