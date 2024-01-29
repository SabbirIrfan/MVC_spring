<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="org.springframework.format.annotation.DateTimeFormat" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: john_doe
  Date: ২৯/১/২৪
  Time: ১০:১০ AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style>
        .counterDiv{
            display: flex;
            flex-direction: column;

        }
        .counterForm{
            display: flex;
            flex-wrap: wrap;

            justify-content: center;
            align-items: center;

        }
        .counterBox{
            display: flex;

            justify-content: center;
            align-items: center;
        }
        .button{
            display: flex;
            justify-content: center;
            background-color: cadetblue;
        }
        .counterHeading{
            display: flex;
            flex-basis: 100%;
            justify-content: center;
            padding-bottom: 10px;
        }
    </style>
</head>
<body>

<%!          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");%>

<form action="countH" class="counterForm">
    <div class="counterHeading">
        <h1>Count is now at </h1>
    </div>
    <div class="counterBox">
<%--        <label for="LocalTime"></label>--%>
        <!--        <input type="text" class="form-control" id="LocalTime" placeholder="LocalTime-Time" aria-describedby="java.time">-->
        <h3> <%= LocalDate.now() +"  >>  " + LocalDateTime.now().format(formatter) %></h3>
    </div>
    <div class="counterBox">
        <!--        <label for="DateTime">Email address</label>-->
        <input type="text" class="form-control" id="DateTime" placeholder="Date-Time" aria-describedby="util.time">
    </div>

    <button type="submit" class="button">Submit</button>
</form>

</body>
</html>