package lab.pw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/hello-servlet")
public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {

		String html = "<html>";
		html += "<head>";
		html += "<title>";
		html += "Hello";
		html += "</title>";
		html += "</head>";
		html += "<body>";
		html += "<h1>";
		html += "Hello";
		html += "</h1>";
		html += "</body>";
		html += "</html>";
		resp.getOutputStream().print(html);

	}
	
}
