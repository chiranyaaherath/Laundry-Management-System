<!DOCTYPE html>
<html lang = "en">
    <head>
        <meta charset="utf-8">
        <link rel = "stylesheet" type = "text/css" href = "css/about_us.css">
        <!--Bootstrap--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>Dash Board</title>
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

    <center><h1 style="color: yellow">Welcome to Dashboard</center> </h1> 




<div class = "col-3">   
    <a href="orders.jsp">
        <img src="img/orders.jpg" alt = "orders" width = "350px" height = "250px" style = "padding-top:10px;float:left; padding-left: 30px;">

    </a>
</div>



<div class = "col-3">

    <a href="cleaning.jsp">
        <img src="img/clean.jpg" alt = "clean" width = "350px" height = "250px" style = "padding-top:10px;float:left; padding-left: 30px;">
    </a>
</div>


<div class = "col-3">
    <a href="store.jsp">
        <img src="img/store.jpg" alt = "store" width = "350px" height = "250px" style = "padding-top:10px;float:left;padding-left: 30px;">
    </a>
</div>




<div class = "col-3">

    <a href="delivery.jsp">
        <img src="img/delivery.jpg" alt = "delivery" width = "350px" height = "250px" style = "padding-top:10px; padding-left: 30px;">
    </a>
</div>



</body>
</html>





