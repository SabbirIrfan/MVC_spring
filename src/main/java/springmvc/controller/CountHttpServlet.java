package springmvc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet( name = "httpservlet",
        description = "This is my counter demo `annotated` HttpServlet",
        urlPatterns = "/countH")
public class CountHttpServlet extends HttpServlet {

    int count ;



    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(LocalDateTime.now() + "in init oh HTTPSERVLET");
        count = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/count.jsp");
//        PrintWriter out = servletResponse.getWriter();
        count = count+1;
//        out.println(count);
        req.setAttribute("count",this.count);
        System.out.println("here in do get");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/count.jsp");
//        PrintWriter out = servletResponse.getWriter();
        count = count+1;
//        out.println(count);
        req.setAttribute("count",this.count);
        System.out.println("here in do get");
        requestDispatcher.forward(req,resp);
    }
}
