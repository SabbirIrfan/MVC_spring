package springmvc.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDateTime;


@WebServlet(
        name = "servlet",
        description = "This is my counter demo `annotated` servlet",
        urlPatterns = "/countS"
)
public class CountServlet implements Servlet {

    int count ;



    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(LocalDateTime.now() + "in init of JUST SERVLET ");
        count = 0;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("WEB-INF/views/count.jsp");
//        PrintWriter out = servletResponse.getWriter();
        count = count+1;
//        out.println(count);
        System.out.println("service method has been called ::"+ count +" times");
        servletRequest.setAttribute("count",count);
        requestDispatcher.forward(servletRequest,servletResponse);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
