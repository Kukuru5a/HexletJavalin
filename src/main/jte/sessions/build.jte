@import org.example.routes.NamedRoutes

<form action="${NamedRoutes.sessionsPath()}" method="post">
    <input type="text" name="nickname" placeholder="Nickname"/>
    <input type="password" name="password" placeholder="Password"/>
    <input type="submit"/>
</form>