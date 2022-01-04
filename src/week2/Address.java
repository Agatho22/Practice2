package week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HTML 문서에서 서블릿으로 데이터를 전송
 */
@WebServlet("/Address")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset = utf-8");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println(name + "님은" + addr + "에 거주하시는군요");
		out.println("</html></body>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
		
	}

}
