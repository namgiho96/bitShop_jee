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

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("맴버 들어옴");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath();
			String a = dir.replace(".do", "");
			String b = a.substring(1, 7);
			dir = b;
			System.out.println(dir);
		}
		String page = request.getParameter("page");
		if (page == null) {
			page = "main";
			System.out.println(page);
		}
		switch (cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");

			if (!(id.equals("id") && pass.equals("pass"))) {
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "남기호");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir, page);
			System.out.println("dir " + dir + " " + page);
			break;

		case "move":
			System.out.println("무브들어옴");
			String dest = request.getParameter("dest");
			if (dest == null) {
				dest = "NONE";
			}
			request.setAttribute("dest", dest);
			Command.move(request, response, dir, page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
