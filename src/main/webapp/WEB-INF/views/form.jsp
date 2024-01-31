
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add notes</title>
    <%@include file="allLink.jsp"%>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

    <body >
    <%@include file="navbar.jsp"%>
        <div >

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
                <input  name="id" id="userId" value="user ID">

                <label for="userName">User name</label>
                <input  name="name" id="userName" value="User name">

                <div class="form-group">
                    <label for="product">Example select</label>
                    <select class="form-control" name="product" id="product">
                        <option>PRODUCT 1</option>
                        <option>PRODUCT 2</option>
                        <option>PRODUCT 3</option>
                        <option>PRODUCT 4</option>
                        <option>PRODUCT 5</option>
                    </select>
                </div>
                <div class="form-group formPad">
                    <label for="productDetail">Product Detail</label>
                    <textarea  class="form-control noteContainer" id="productDetail" name="detail" required>Write something about you about this product.
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

