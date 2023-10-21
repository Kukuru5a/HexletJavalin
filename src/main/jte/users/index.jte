@import org.example.routes.NamedRoutes
@import org.example.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
<h1>${page.getHeader()}</h1>
@if(page.getUsers().isEmpty())
    <p>No users yet</p>
    <a href="${NamedRoutes.newUserPath()}">Register a new user</a>
@else
    @for(var user : page.getUsers())
        <div>
            <h2><a href="/users/${user.getId()}">${user.getName()}</a></h2>
            <p>${user.getEmail()}</p>
        </div>
    @endfor
@endif
`
)