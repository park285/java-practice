package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "inputController", value = "/calc/input")
public class InputController extends HttpServlet {
    @Override
//calc/input 으로 겟 요청이 들어왔을떄 실행되는 메서드
// HttpServletRequest : REQUEST의 모든 데이터를 담고있는 매개변수
// HttpServletResponse : Response에서 설정되는 기본 데이터를 담고 있는 매개변수
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController ...doGet...");
        //view페이지를 설정하는 기능 : 기본위치는 webapp
//    RequestDispatcher란 view페이지를 설정하는 기능
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        //FORWARD():VIEW페이지로 넘어가도록 실행하는 메서드 REQUSET RESPONSE 데이터 모두 보내주고있음
        dispatcher.forward(req, resp);
        // dispatcher.forward(req, resp); 은 고정이라고 생각해도 좋다
    }
//req.getRequestDispatcher(input태그의 name값):input태그에 들어있던 값을 요청해서 꺼내어 반환하는 매서드
    // /calc/input의 요청시 post라면 do post가 실행
    // /calc/input의 요청시 get라면 do get이 실행
    // 하나의 주소 /calc/input을 이용하여 두가지 메서드를 실행할수있음.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("num1");
        String b = req.getParameter("num2");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/result.jsp");
//        dispatcher.forward(req, resp);
        resp.sendRedirect("/calc/input?num1=" + a + "&num2=" + b);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("InputController ...init");
    }


    }
}
