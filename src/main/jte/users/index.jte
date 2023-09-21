@import org.example.users.UsersPage
@param UsersPage page

<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Хекслет</title>
</head>
<body>
<h1>${page.getHeader()}</h1>
@if(page.getUsers().isEmpty())
    <p>No courses yet</p>
@else
    @for(var user : page.getUsers())
        <div>
            <h2><a href="/users/${user.getId()}">${user.getName()}</a></h2>
            <p>${user.getEmail()}</p>
        </div>
    @endfor
@endif
</body>
</html>