package org.zerock.w1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
// Servlet : 요청을 받아 데이터를  취득하거나 저장한후 화면을 돌려주는 역활하는 기능
// name : 서블렛의 이름(다른 서블릿과 중복되지 않는 이름 설정하기)
// value : 도메인/value값: servlet을 요청할떄 사용하는 주소의 값
// jsp 란 자바 서버 페이지 servelt과 jsp는 동적으로 데이터를 생성해 전송하는건 동일하나 구현방법이 다름
// servelt = java코드+html
// jsp = html + java
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
//        html파일에 작성할 내용을 적는 기능
        PrintWriter out = response.getWriter();
//         html파일에 <html><body>내용을 추가하는 기능
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}