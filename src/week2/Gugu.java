package week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������ ���
 * HTML �������� ����� ������ ���ڸ� �����Ѵ�
 * ������ ���ڸ� ���������� �Ѱܼ� �ش� ������ �������� ����Ѵ�
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
		out.println("<h3>������" + num + "��</h3>");
		for (int i = 1; i <= 9; i++) {
			out.println(num + "*" + i + "=" + num * i + "<br>");
		}
		out.println("</html></body>");
		out.close();
	}
}