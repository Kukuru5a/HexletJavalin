@import org.example.routes.MainPage
@param MainPage page
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hello Hexlet</title>
    </head>
    <body>
        <div class="col-lg-8 mx-auto p-4 py-md-5">
            <main>
                <h1 class="text-body-emphasis">Привет Хекслет!</h1>
                <p>Javalin + jte</p>
                @if(page.getCurrentUser() != null)
                    Welcome, ${page.getCurrentUser()}.
                    In order to logout delete JSESSIONID cookie from browser.
                @endif
                <a href="users">Users</a>
                <a href="courses">Courses</a>
            </main>
        </div>
    </body>
</html>