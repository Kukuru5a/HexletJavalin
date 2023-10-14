@template.layout,page(
    content = @`
        <form action="/courses" method="post">
            <div>
                <label>
                    Course name
                    <input type="text" name="name">
                </label>
            </div>
            <div>
                <label>
                    Description
                    <input type="text" name="description">
                </label>
            </div>
            <div>
                <label>
                    Course name
                    <input type="number" name="id">
                </label>
            </div>
            <input type="submit" name="Submit">
        </form>
    `
    )