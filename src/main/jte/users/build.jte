@template.layout.page(
    content = @`
        <form action="/users" method="post">
            <div>
                <label>
                    Name
                    <input type="text" name="name">
                </label>
            </div>
            <div>
                <label>
                    Email
                    <input type="text" required name="email">
                </label>
            </div>
            <div>
                <label>
                    Password
                    <input type="password" required name="password">
                </label>
            </div>
            <div>
                <label>
                    Confirm password
                    <input type="password" required name="passwordConfirmation">
                </label>
            </div>
            <input type="submit" value="Register">
        </form>
`
)