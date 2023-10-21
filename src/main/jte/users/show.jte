@import org.example.users.UserPage
@param UserPage usr

@template.layout.page(
    content = @`
    <h1>${usr.getUser().getName()}</h1>
    <h2>${usr.getUser().getEmail()}</h2>
`
)