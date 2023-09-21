@import org.example.hexlet.CoursePage
@param CoursePage page

<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Хекслет</title>
</head>
<body>
    <p>${page.getCourse().getName()}</p>
    <p>${page.getCourse().getDescription()}</p>
</body>
</html>