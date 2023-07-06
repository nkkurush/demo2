package com.example.demo2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
        HttpSession session = request.getSession();
        Integer count = (Integer)session.getAttribute("count");
        if(count == null){
            session.setAttribute("count",1);
        }else{
            session.setAttribute("count",count+1);
        }
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Count=  " + session.getAttribute("count") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}