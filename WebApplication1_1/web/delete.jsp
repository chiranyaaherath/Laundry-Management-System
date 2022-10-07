

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    String user = request.getParameter("user");

    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");

        PreparedStatement psm = con.prepareStatement("delete from delivery where name='" + user + "'");
        PreparedStatement ps = con.prepareStatement("delete from store where name='" + user + "'");
        PreparedStatement pm = con.prepareStatement("delete from orders where name='" + user + "'");

        ps.executeUpdate();
        pm.executeUpdate();
        psm.executeUpdate();
        psm.close();
        ps.close();
        pm.close();
        response.sendRedirect("delivery.jsp");

    } catch (Exception e) {

        response.sendRedirect("delivery.jsp");
        out.println(e.getMessage());
    }

%>