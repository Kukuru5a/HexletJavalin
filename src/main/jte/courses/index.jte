@import org.example.hexlet.CoursesPage
@param CoursesPage page

<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Хекслет</title>
    </head>
    <body>
        <h1>${page.getHeader()}</h1>
        @if(page.getCourses().isEmpty())
            <p>No courses yet</p>
        @else
            @for(var course : page.getCourses())
                <div>
                    <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                    <p>${course.getDescription()}</p>
                </div>
            @endfor
        @endif
    </body>
</html>