package week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 구구단 출력
 * HTML 문서에서 출력할 구구단 숫자를 선택한다
 * 선택한 숫자를 서블릿으로 넘겨서 해당 숫자의 구구단을 출력한다
 */
@WebServlet("/Gugu")
public class Gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Gugu() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = utf-8");
		int num = Integer.parseInt(request.getParameter("number"));
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>구구단" + num + "단</h3>");
		for (int i = 1; i <= 9; i++) {
			out.println(num + "*" + i + "=" + num * i + "<br>");
		}
		out.println("</html></body>");
		out.close();
	}
}
