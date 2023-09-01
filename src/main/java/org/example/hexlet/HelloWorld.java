package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {config.plugins.enableDevLogging();});
        app.get("/hello/{name}",ctx -> {
//            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("Hello, World!");
            ctx.result("Hello, " + ctx.pathParam("name" + "!"));
        });
        app.get("/hello", ctx -> ctx.result("Hello, World!"));
        app.start(7070);
    }
}
