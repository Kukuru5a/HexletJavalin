package gg.jte.generated.ondemand;
import org.example.routes.MainPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,13,13,13,14,14,14,16,16,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, MainPage page) {
		jteOutput.writeContent("<html lang=\"en\">\n    <head>\n        <meta charset=\"UTF-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n        <title>Hello Hexlet</title>\n    </head>\n    <body>\n        <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\n            <main>\n                <h1 class=\"text-body-emphasis\">Привет Хекслет!</h1>\n                <p>Javalin + jte</p>\n                ");
		if (page.getCurrentUser() != null) {
			jteOutput.writeContent("\n                    Welcome, ");
			jteOutput.setContext("main", null);
			jteOutput.writeUserContent(page.getCurrentUser());
			jteOutput.writeContent(".\n                    In order to logout delete JSESSIONID cookie from browser.\n                ");
		}
		jteOutput.writeContent("\n                <a href=\"users\">Users</a>\n                <a href=\"courses\">Courses</a>\n            </main>\n        </div>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		MainPage page = (MainPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
