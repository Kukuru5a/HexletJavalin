@import org.example.courses.CoursesPage
@import org.example.routes.NamedRoutes
@import org.example.courses.CoursePage
@param CoursesPage page
@param CoursePage pg

@template.layout.page (
content = @`
        <h1>${page.getHeader()}</h1>
    @if(pg.getFlash() != null)
        <p>${pg.getFlash()}</p>
    @endif
        @if(page.getCourses().isEmpty())
            <p>No courses yet</p>
            <a href="${NamedRoutes.buildCoursPath()}">Add course</a>
        @else
            @for(var course : page.getCourses())
                <div>
                    <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                    <p>${course.getDescription()}</p>
                </div>
            @endfor
        @endif
`
)