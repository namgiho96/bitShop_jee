package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String dir = request.getServletPath();
		String a = dir.replace(".do", "");
		int c = dir.indexOf('.');
		String b = dir.substring(1, c);
		System.out.println(b);
		dir = request.getParameter("dir");
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");

		if (dir == null) {
			dir = b;
		}
		
		if (page == null) {
			page = "main";
		}
		switch ((cmd == null) ? "move" : cmd) {

		case "login":
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");

			if (id.equals("id") && pass.equals("pass")) {
				Command.move(request, response, dir + "/" + page);
			} else {
				Command.move(request, response, "index");
			}
			break;
		case "move":
			Command.move(request, response, dir+"/"+page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
