
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OneToMany/title>
    <%@include file="allLink.jsp"%>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

    <body >
    <%@include file="navbar.jsp"%>
        <div style="height: 100%; padding-bottom: 88px">

            <%
                if(request.getAttribute("status") != null)
                    out.println(request.getAttribute("status"));
                if(request.getAttribute("tittle") == null)
                    request.setAttribute("tittle","Give a title to your product");

                if(request.getAttribute("content") == null)
                    request.setAttribute("content", "what you wanna save for latter");

                if(request.getAttribute("id") == null){
                    request.setAttribute("id","no");

                }
                System.out.println(request.getAttribute("id")+ " in add notes");

            %>


            <%--   ADD NOTES  --%>
            <form action="savenoteoldway" method="post">

                <label for="userId">User Id</label>
                <input  name="id" id="userId" placeholder="user ID">

                <label for="userName">User name</label>
                <input  name="name" id="userName" placeholder="User name">

                <div class="form-group">
                    <label for="product">Example select</label>
                    <select class="form-control" name="product" id="product">
                        <option>Dell xps</option>
                        <option>Lenovo ThinkPad</option>
                        <option>Acer Swift Edge</option>
                        <option>Framework Laptop 13</option>
                    </select>
                </div>
                <div class="form-group formPad">
                    <label for="productDetail">Product Detail</label>
                    <textarea  class="form-control noteContainer" id="productDetail" name="detail" placeholder="Write something about you about this product." required>
                    </textarea>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>


        </div>
    </body>
</html>



<%--<div class="form-group formPad">--%>
<%--    <label for="tittle">Note Tittle</label>--%>
<%--    <input type=text class="form-control" id="tittle" name="tittle" required aria-describedby="emailHelp" value="<% out.println(request.getAttribute("tittle"));%>">--%>
<%--    <small id="emailHelp" class="form-text text-muted">We'll never share your Notes with anyone else But why should you believe anything I promise</small>--%>
<%--</div>--%>

