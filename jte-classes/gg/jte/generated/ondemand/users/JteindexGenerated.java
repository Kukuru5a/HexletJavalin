package gg.jte.generated.ondemand.users;
import org.example.users.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,10,10,10,10,11,11,13,13,14,14,16,16,16,16,16,16,16,17,17,17,19,19,20,20,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <title>Хекслет</title>\n</head>\n<body>\n<h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\n");
		if (page.getUsers().isEmpty()) {
			jteOutput.writeContent("\n    <p>No courses yet</p>\n");
		} else {
			jteOutput.writeContent("\n    ");
			for (var user : page.getUsers()) {
				jteOutput.writeContent("\n        <div>\n            <h2><a href=\"/users/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(user.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(user.getName());
				jteOutput.writeContent("</a></h2>\n            <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getEmail());
				jteOutput.writeContent("</p>\n        </div>\n    ");
			}
			jteOutput.writeContent("\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
