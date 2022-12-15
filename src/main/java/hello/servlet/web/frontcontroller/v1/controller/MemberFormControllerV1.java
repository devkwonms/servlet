package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {
    public MemberFormControllerV1(){
        System.out.println("memberformcontoller 생성자");
    }
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("MemberFormControllerV1.process!!");

        String viewPath = "/WEB-INF/views/new-form.jsp";
        // controller에서 view로 이동할 때 사용
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request,response);
    }
}
