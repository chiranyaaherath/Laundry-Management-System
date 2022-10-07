<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang = "en">
    <head>
        <meta charset="utf-8">

        <link rel = "stylesheet" type = "text/css" href = "css/about_us.css">
        <!--Bootstrap--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>Store Section</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <style>   p.heading{
                text-align : center;	
                padding : 20px;
                font-size : 50px;
                color : orange;
                font-family: HeadFont;
            }

            body{
                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/a.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                background-attachment:fixed;
                background-position : center center;


            }

            input[type=text], input[type=password], input[type=email] {
                width: 90%;
                padding: 5px 2px;
                margin: 10px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 5px;

            } 

            .start_login{
                padding: 16px;
                text-align : center;

            }

            .form_design{
                margin : 3% 30% 0% 35%;
                width  : 30%;
                background: linear-gradient(rgba(0,0,0,.6), rgba(0,0,0,.6));
                border: 1px solid blueviolet;
                border-radius: 40px;

            }

            *{
                box-sizing: border-box;
            }

            @font-face {
                font-family: NavFont;
                src: url(Fonts/fon4.otf);

            }
            @font-face{
                font-family: TextFont;
                src: url(Fonts/font1.otf);;
            }

            @font-face {
                font-family: HeadFont;
                src: url(Fonts/font2.otf);

            }

        </style>
    </head>

    <body>

        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("index.html");
            }
        %>
<!-- Navigation Bar -->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">

                <ul class="nav navbar-nav">
                    <li><a href="admin.jsp">Home</a></li>
                    <li><a href="orders.jsp">Orders</a></li>
                    <li><a href="cleaning.jsp">Cleaning</a></li>
                    <li><a href="store.jsp">Store</a></li>
                    <li><a href="delivery.jsp">Delivery</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                </ul>
            </div>
        </nav>

        <p class = "heading"><b>Store Section</b></p>

        <form class = "form_design"  action = "update" method = "post">

            <div class = "start_login">

                <label for = "customer" style = "font-size:30px; color:#F5FFFA;">Customer</label>
                <form action="">
                    <select name="customer">
                        <% try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");
                                String query = "select name from orders";
                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery(query);

                                while (rs.next()) {

                        %>
                        <option value="<%=rs.getString("name")%>">
                            <%=rs.getString("name")%>

                        </option>

                        <% }
                            } catch (Exception e) {
                                out.println(e.getMessage());
                            }
                        %>
                    </select>
                    <br><br>

                    <label for = "status" style = "font-size:30px; color:#F5FFFA;">Status </label>
                    <select name="status">
                        <option>Finished</option>
                        <option>Not Finished</option>


                    </select><br><br>

                    <label for = "price" style = "font-size:30px; color:#F5FFFA;">Price </label>
                    <input type = "text" placeholder = "Enter price" name = "price" required><br>

                    <button type = "submit" class="btn btn-primary" name = "user-register" style="font-size: 20px; width: 50%;"><b>Update Status</b></button>
            </div>
        </form>

    </body>
</html>