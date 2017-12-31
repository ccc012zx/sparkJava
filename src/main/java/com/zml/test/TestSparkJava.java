package com.zml.test;

import static spark.Spark.get;
import static spark.Spark.init;
import static spark.Spark.port;


public class TestSparkJava {
    public void test(){
        init();
        get("/hello", (req, res) -> "Hello World1");
        get("zml",((request, response) -> "zml11"));
    }
}
