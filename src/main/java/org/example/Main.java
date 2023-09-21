package org.example;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.Course;
import org.example.hexlet.CoursePage;
import org.example.hexlet.CoursesPage;
import org.example.users.User;
import org.example.users.UserPage;
import org.example.users.UsersPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("name 1", "desc1");
        Course course2 = new Course("name 2", "desc2");
        Course course3 = new Course("name 3", "desc3");
        course1.setId(0L);
        course2.setId(1L);
        course3.setId(2L);



        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        User usr1 = new User("roma", "roma@mail.ru");
        User usr2 = new User("Kostya", "kst@mail.ru");
        User usr3 = new User("Gosha", "geo@mail.ru");

        List<User> userList = new ArrayList<>();
        userList.add(usr1);
        userList.add(usr2);
        userList.add(usr3);




        JavalinJte.init();

        Javalin app = Javalin.create(config -> config.plugins.enableDevLogging());

        app.get("/courses", ctx -> {
            var header = "Programming courses";
            var page = new CoursesPage(courseList, header);
            ctx.render("courses/index.jte", Collections.singletonMap("page", page));
        });
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var course = courseList.get(Integer.parseInt(id));
            var page = new CoursePage(course);
            ctx.render("courses/show.jte", Collections.singletonMap("page", page));
        });
        app.get("/", ctx -> {
            var header = "Welcome";
            var page = new UsersPage(userList, header);
            ctx.render("layout/page.jte", Collections.singletonMap("page", page));
        });
        app.get("/users", ctx -> {
            var header = "User List";
            var page = new UsersPage(userList, header);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });

        app.start(7070);
//        var app = Javalin.create (config -> {config.plugins.enableDevLogging();});
//        app.get("/", ctx -> ctx.render("index.jte"));
//        app.start(7070);
    }
}