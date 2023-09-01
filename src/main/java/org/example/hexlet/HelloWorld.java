package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {config.plugins.enableDevLogging();});
        app.get("/hello", ctx -> ctx.result("Hello, World!"));
        app.get("/hello/{name}",ctx -> {
            ctx.result("Hello, " + ctx.pathParam("name"));
        });
        app.get("/courses/{id}", ctx -> {
            ctx.result("Course ID: " + ctx.pathParam("id"));
        });
        app.get("/users/{id}", ctx -> {
            ctx.result("User ID: " + ctx.pathParam("id"));
        });
        app.start(7070);
    }
}
