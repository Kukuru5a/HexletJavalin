@import org.example.courses.CoursesPage
@param CoursesPage page

@template.layout.page(
content = @`
    <h1>Курсы</h1>

    <div class="mb-3">
        <a href="/courses/build">Создать новый курс</a>
    </div>

    <table class="table table-striped">
        @for(var course : page.getCourses())
            <tr>
                <td>
                    ${course.getId()}
                </td>
                <td>
                    ${course.getName()} ${course.getDescription()}
                </td>
            </tr>
        @endfor
    </table>
`
)