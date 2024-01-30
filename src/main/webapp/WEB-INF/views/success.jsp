<%@ page import="springmvc.model.Note" %><%--
  Created by IntelliJ IDEA.
  User: john_doe
  Date: ২৫/১/২৪
  Time: ৫:১২ PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>
<%--        ${note.getContent()}--%>
        <%
            Note note =(Note) request.getAttribute("note");
//            System.out.println(note.getContent());
        %>
    </h1>
</body>
</html>
