package unit01; // 서블릿 클래스가 속한 패키지 선언

import java.io.IOException; // 입출력 예외 처리를 위한 클래스
import java.io.PrintWriter; // 클라이언트로 텍스트 데이터를 보내기 위한 클래스

// 서블릿 관련 클래스들을 임포트
import javax.servlet.ServletException; // 서블릿 예외 처리를 위한 클래스
import javax.servlet.annotation.WebServlet; // 서블릿 애노테이션을 사용하기 위한 클래스
import javax.servlet.http.HttpServlet; // HTTP 프로토콜을 처리하기 위한 기본 서블릿 클래스
import javax.servlet.http.HttpServletRequest; // 클라이언트의 요청 정보를 담는 클래스
import javax.servlet.http.HttpServletResponse; // 서버의 응답 정보를 담는 클래스

/**
 * Servlet implementation class HelloServlet 이 클래스는 HTTP 요청을 처리하고 응답을 생성하는
 * 서블릿입니다.
 */
@WebServlet("/hello") // 이 서블릿이 "/hello" URL 패턴으로 요청을 처리하도록 매핑
public class HelloServlet extends HttpServlet {
	// 설명: HelloServlet 클래스가 HttpServlet 클래스를 상속받아 서블릿으로 동작함을 나타냅니다.
	// HttpServlet은 HTTP 프로토콜을 처리하기 위한 기본적인 메서드들을 제공합니다.
	private static final long serialVersionUID = 1L; // 버전 관리를 위한 고유 식별자
	/*
	 * 설명: 직렬화(Serialization)와 관련된 고유 식별자입니다. 서블릿은 직렬화가 가능하기 때문에, 클래스의 버전 관리에 사용됩니다.
	 * 이는 주로 IDE가 자동으로 생성하며, 개발자가 직접 수정할 필요는 없습니다.
	 */

	/**
	 * Default constructor. 서블릿의 기본 생성자. 여기서는 부모 클래스의 생성자를 호출합니다.
	 */
	public HelloServlet() {
		super(); // 부모 클래스(HttpServlet)의 생성자 호출
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) 클라이언트로부터 GET 요청이 들어왔을 때 호출되는 메서드
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// request에게 정보가 담김, response로 응답 throws : exception으로 넘겨버림
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// http://localhost:8081/web-study-02/hello <= 로컬 주소

		// 클라이언트에게 보내는 응답의 콘텐츠 타입을 "text/html"로 설정
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		// 응답을 작성하기 위한 PrintWriter 객체를 가져옴
		PrintWriter out = response.getWriter();

		// HTML 형식의 응답 내용을 작성
		out.print("<html><body><h1>");
		out.print("Hello Servlet"); // "Hello Servlet" 텍스트를 <h1> 태그로 감쌈
		out.print("</h1><br><h2>hello jsp</h2>");// "hello jsp" 텍스트를 <h2> 태그로 감쌈
		out.print("<br><h2>서블릿</h2>");
		out.print("</body></html>"); // HTML 문서 종료 태그
		// 클라이언트에게 HTML 응답을 전송

		// PrintWriter 객체를 닫아 리소스를 해제
		out.close();

		// 아래 주석된 코드는 원래 "Served at: /컨텍스트경로"라는 메시지를 클라이언트에게 보내는 코드였으나 현재는 사용되지 않음
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) 클라이언트로부터 POST 요청이 들어왔을 때 호출되는 메서드
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// POST 요청을 처리할 때 GET 요청과 동일하게 처리하도록 doGet 메서드를 호출
		doGet(request, response);
	}

}