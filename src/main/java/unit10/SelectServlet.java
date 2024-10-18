package unit10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 모두 사용자가 제출한 폼 데이터에서 값을 가져오는 역할을 하지만, 반환되는 데이터의 형식과 사용 목적이 다름
		
		String job= request.getParameter("job");
		// 특정한 폼 필드의 하나의 값을 가져올 때 사용됩니다.
		String interests[] = request.getParameterValues("interest");
		// 특정한 폼 필드의 여러 값을 가져올 때 사용됩니다.
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.println("니가 고른 직업: <b>");
		out.print(job);
		
		out.println("</b><hr>니가 고른 관심분야: <b>");
		if(interests == null) {
			out.print("고른 게 없음");
		}
		else {
			for(int i = 0;i <interests.length;i++) {
				out.print(interests[i]+ " ");
			}
		}
		out.println("</b><br><a href='javascript:history.go(-1)>돌아가기</a>'");
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
