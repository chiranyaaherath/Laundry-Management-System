
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/store"})
public class store extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String customer = request.getParameter("customer");
        int no_white = Integer.parseInt(request.getParameter("white"));
        int no_colour = Integer.parseInt(request.getParameter("colour"));
        String status = "Start";

        if (customer.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver"); //load the jdbc driver
                //connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");
                String query = "INSERT INTO store VALUES(?,?,?,?)";
                PreparedStatement psm = con.prepareStatement(query);

                psm.setString(1, customer);
                psm.setInt(2, no_white);
                psm.setInt(3, no_colour);
                psm.setString(4, status);

                psm.executeUpdate();
                psm.close();

                out.println("<h2 style='color: black'>Your Details Successfully Added....!!! Back to <a href='cleaning.jsp'>Cleaning Section. </a></h2>");

              
                session.setAttribute("status", "Successfully Registerd !!!!");

            } catch (Exception e) {

                out.println("<h2 style='color: black'>Submission Failed....!!! <a href='cleaning.jsp'>Try Again.</a></h2>");
                session.setAttribute("status", "Registration Failed !!!!");
                
                out.println(e.getMessage());
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
