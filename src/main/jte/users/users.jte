@import org.example.routes.NamedRoutes
@import org.example.users.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <h1>Пользователи</h1>
    <div class="mb-3">
        <a href="${NamedRoutes.newUserPath()}">Зарегистрировать нового пользователя</a>
    </div>


    <table class="table table-striped">
        @for(var user : page.getUsers())
            <tr>
                <td>
                    ${user.getId()}
                </td>
                <td>
                    ${user.getName()} ${user.getEmail()}
                </td>
            </tr>
        @endfor
    </table>
`
)