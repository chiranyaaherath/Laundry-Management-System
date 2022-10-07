
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String nic = request.getParameter("nic");
        String mobile = request.getParameter("mobile");
        String username = request.getParameter("u_name");
        String password = request.getParameter("pass");

        if (name.isEmpty() || nic.isEmpty() || mobile.isEmpty() || username.isEmpty() || password.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver"); // load the jdbc driver
                //connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");
                String query = "INSERT INTO user VALUES(?,?,?,?,?)";
                PreparedStatement psm = con.prepareStatement(query);
                psm.setString(1, name);
                psm.setString(2, nic);
                psm.setString(3, mobile);
                psm.setString(4, username);
                psm.setString(5, password);

                psm.executeUpdate();
                psm.close();

                out.println("<h2 style='color: black'>Successfully Registerd....!!! Now You Can <a href='login.jsp'>Login Here... </a></h2>");
                

                session.setAttribute("status", "Successfully Registerd !!!!");

            } catch (Exception e) {

                out.println("<h2 style='color: black'>Registration Failed !!!! <a href='Register.jsp'>Register Again </a>with correct details.</h2>");
                session.setAttribute("status", "Registration Failed !!!!");

                
            }

        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
