package hai;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<h1>Namaste</h1>");
}
	
}

