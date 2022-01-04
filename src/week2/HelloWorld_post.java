package week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Post 방식 : 매개변수를 본문에 포함시켜 호출하는 방식
 */
@WebServlet("/HelloWorld_post")
public class HelloWorld_post extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloWorld_post() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello World Servlet doPost() 페이지입니다</h1>");
		out.println("</body></html>");
		out.close(); 
	}

}
