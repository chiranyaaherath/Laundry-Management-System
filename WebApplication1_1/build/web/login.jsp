<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <!-- Meta tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Gaze Sign up & login Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design"
              />
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);
            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
       
        <!--stylesheets-->
        <link href="css/style.css" rel='stylesheet' type='text/css' media="all">
        <!--//style sheet end here-->
        <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">
    </head>
    <body>
        <div class="mid-class">
            <div class="art-right-w3ls">
                <h2>Login</h2>
                <form action="login" method="post">
                    <div class="main">
                        <div class="form-left-to-w3l">
                            <input type="text" name="username" placeholder="Username" required="">
                        </div>
                        <div class="form-left-to-w3l ">
                            <input type="password" name="password" placeholder="Password" required="">
                            <div class="clear"></div>
                        </div>
                    </div>
                    <div class="left-side-forget">
                        <input type="checkbox" class="checked">
                        <span class="remenber-me">Remember me </span>
                    </div>
                    <div class="right-side-forget">
                        <a href="#" class="for">Forgot password...?</a>
                    </div>
                    <div class="clear"></div>
                    <div class="btnn">
                        <button type="submit">Sign In</button>
                    </div>
                </form>
                <div class="w3layouts_more-buttn">
                    <h3>Don't Have an account..?
                        <a href="Register.jsp">Sign Up Here
                        </a>
                    </h3>
                </div>
                <!-- popup-->
                <div id="content1" class="popup-effect">
                    <div class="popup">

                        <!--//login form-->
                        <a class="close" href="#">&times;</a>
                    </div>
                </div>
                <!-- //popup -->
            </div>
            <div class="art-left-w3ls">
                <h1 class="header-w3ls">
                    A better place to do your laundry
                </h1>
            </div>
        </div>
      
    </body>
</html>