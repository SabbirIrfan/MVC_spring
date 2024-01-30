
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add notes</title>
    <%@include file="allLink.jsp"%>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

    <body>
        <div class="container">
            <%@include file="navbar.jsp"%>
            <%
                if(request.getAttribute("status") != null)
                    out.println(request.getAttribute("status"));
                if(request.getAttribute("tittle") == null)
                    request.setAttribute("tittle","Give a title to your note");

                if(request.getAttribute("content") == null)
                    request.setAttribute("content", "what you wanna save for latter");

                if(request.getAttribute("id") == null){
                    request.setAttribute("id","no");

                }
                System.out.println(request.getAttribute("id")+ " in add notes");

            %>


            <%--   ADD NOTES  --%>
            <form action="savenoteoldway" method="post">

                <input type="hidden" name="id" id="id" value="<%=request.getAttribute("id")%>">

                <div class="form-group formPad">
                    <label for="tittle">Note Tittle</label>
                    <input type=text class="form-control" id="tittle" name="tittle" required aria-describedby="emailHelp" value="<% out.println(request.getAttribute("tittle"));%>">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your Notes with anyone else But why should you believe anything I promise</small>
                </div>

                <div class="form-group formPad">
                    <label for="content">Content</label>
                    <textarea  class="form-control noteContainer" id="content" name="content" required>
                        <% out.println(request.getAttribute("content"));%>
                    </textarea>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>


        </div>
    </body>
</html>
