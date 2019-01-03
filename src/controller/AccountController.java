package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;


@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("+++ 어카운트 서블릿으로 들어옴 +++");
		String action = request.getParameter("action");

		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		
		if (page == null) {
			page = "main";
		}
		if(dir==null) {
			dir = request.getServletPath();
			int b = dir.indexOf(".");
			String a = dir.substring(1,b);
			dir = a;
		}
		
		switch ((action == null) ? "move" : action) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir+"/"+page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
