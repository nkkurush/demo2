package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "setCookieServlet", value = "/set-cookie-servlet")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("jsessionid","777777");
        Cookie cookie2 = new Cookie("jsessionName","Kurush");

        cookie1.setMaxAge(60*60*24);
        cookie2.setMaxAge(60*60*24);

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);

    }
}