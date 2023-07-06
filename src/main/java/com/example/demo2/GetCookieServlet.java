package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.print.attribute.standard.Copies;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookieServlet", value = "/get-cookie-servlet")
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        for (Cookie c: cookies) {
            pw.println("<h1>" + c.getName() + "  " + c.getValue() +  "</h1>");
        }
        pw.println("</html>");
    }
}