package com.zml.test;

import spark.Spark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static spark.Spark.get;
import static spark.Spark.port;


public class InitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(2222222);
        TestSparkJava t = new TestSparkJava();
        t.test();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("1111111111111111");

//        port(8080);

//        get("zml",((request, response) -> "zml11"));
    }
}
