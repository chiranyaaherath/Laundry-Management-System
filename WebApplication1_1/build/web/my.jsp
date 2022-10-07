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

        <title>Finished Orders</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            p.heading{
                text-align : center;	
                padding : 20px;
                font-size : 50px;
                color : orange;
                font-family: HeadFont;
            }

            body{
                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/d.jpg');
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
            td,th{
                background-color:w; 

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
                    <li><a href="customer.jsp">Home</a></li>
                    <li><a href="add.jsp">Add Orders</a></li>
                    <li><a href="my.jsp">Finished Orders</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">

                    <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
        <table border="1" class="table table-hover" style="  color: white;width: 80%;">

            <center><h3 style="color: yellow">These orders are ready to deliver</h3></center>  
            <br>

            <tr>
                <th >Name</th>
                <th>Status</th>



            </tr>


            <%  try {

                    String name = (String) session.getAttribute("username");

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");

                    ResultSet rs = con.createStatement().executeQuery("SELECT store.name,store.status FROM store,user where user.username='" + name + "' and user.name=store.name");

                    while (rs.next()) {
                        String user = rs.getString("name");
                        String status = rs.getString("status");


            %>
            <tr>
                <td><%=user%></td>
                <td><%=status%></td>





            </tr>
            <%
                    }
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            %>

        </table>


    </body>
</html>






