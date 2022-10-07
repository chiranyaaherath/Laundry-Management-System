<!DOCTYPE html>
<html lang = "en">
    <head>
        <meta charset="utf-8">
        <link rel = "stylesheet" type = "text/css" href = "css/about_us.css">
        <!--Bootstrap--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>Register</title>
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
<!-- Navigation Bar -->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">

                <ul class="nav navbar-nav">
                    <li><a href="index.html">Home</a></li>

                    <li><a href="about.html">About Us</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>

        <p class = "heading"><b>Register Now</b></p>

        <form class = "form_design"  action = "register" method = "post">

            <div class = "start_login">

                <label for = "name" style = "font-size:30px; color:#F5FFFA;">Name</label>
                <input type = "text" placeholder = "Enter Name" name = "name" required>

                <label for = "nic" style = "font-size:30px; color:#F5FFFA;"> NIC number</label>
                <input type = "text" placeholder = "Enter NIC number" name = "nic" required><br><br>


                <label for = "mobile" style = "font-size:30px; color:#F5FFFA;">Mobile Number</label>
                <input type = "text" placeholder = "Enter mobile number" name = "mobile" required><br><br>

                <label for = "u_name" style = "font-size:30px; color:#F5FFFA;">Username</label>
                <input type = "text" placeholder = "Enter username" name = "u_name" required>

                <label for = "pass" style = "font-size:30px; color:#F5FFFA;">Password</label>
                <input type = "password" placeholder = "Enter password" name = "pass" required><br><br>






                <button type = "submit" class="btn btn-primary" name = "user-register" style="font-size: 20px; width: 50%;"><b>Register</b></button>
            </div>
        </form>



    </body>
</html>