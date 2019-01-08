package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AcountService;
import service.AcountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AcountService service = new AcountServiceImpl();
		AccountBean bean = null;

		System.out.println("(1)account 들어옴");

		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		System.out.println("cmd");
		String page = request.getParameter("page");
		if (page == null) {
			page = "main";
			System.out.println("page" + page);
		}

		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath();
			int b = dir.indexOf(".");
			String a = dir.substring(1, b);
			dir = a;
			System.out.println("dir" + dir);

			switch (cmd) {
			case "move":
				request.setAttribute("dest", "open-form");
				Command.move(request, response, dir, page);
				System.out.println(": " + dir + page);
				break;

			case "open-account":
				
				request.setAttribute("acc",service.createAccountNum());
				request.setAttribute("dest", request.getParameter("dest"));
				String money = request.getParameter("money");
				request.setAttribute("acc", service.findcount(
						service.openAccountNum(Integer.parseInt(money))));
				Command.move(request, response, dir, page);
				break;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
