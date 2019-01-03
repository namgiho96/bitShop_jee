package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/article.do")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("+++ 게시판 서블릿으로 들어옴 +++");
		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		
		if(dir == null) {
			dir = request.getServletPath();
			int a = dir.indexOf(".");
			String b = dir.substring(1,8);
			dir = b;
		}
		if(page==null) {
			page ="main";
		}
		
		
		String action = request.getParameter("action");
		switch((action == null) ? "move": action) {
		case "move":
			System.out.println("무브이동");
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
