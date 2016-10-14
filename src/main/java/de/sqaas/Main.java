package de.sqaas;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Software quotes as a service starting up");
        get("/quotes", (req, res) -> "Hello Programming Quotes");
    }
}