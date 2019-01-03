package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("+++ 아티클 +++");
		String action = request.getParameter("action");
		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		
		if(dir == null) {
			dir = request.getServletPath();
			int a = dir.indexOf(".");
			dir = dir.substring(1,a);
			 
		}
		if(page==null) {
			page ="main";
		}
		switch((action == null) ? "move": action) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir+"/"+page);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
