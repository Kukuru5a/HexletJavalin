@import org.example.courses.CoursePage
@param CoursePage page

@template.layout.page (
    content = @`
    <p>${page.getCourse().getName()}</p>
    <p>${page.getCourse().getDescription()}</p>

`
)