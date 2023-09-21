@import org.example.users.UserPage
@param UserPage usr

<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>${usr.getUser().getName()}</title>
    </head>
    <body>
        <h1>${usr.getUser().getName()}</h1>
        <h2>${usr.getUser().getEmail()}</h2>
    </body>
</html>