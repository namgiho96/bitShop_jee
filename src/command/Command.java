package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;


public class Command {
	public static void move(HttpServletRequest request, HttpServletResponse response,String  path)throws ServletException, IOException {
		System.out.println("무브안에 들어옴");
		String dispatcher = "";
		if(path.equals("index")) {
			System.out.println("index일경우");
			dispatcher = "/index.jsp";
		}else {
			System.out.println("index가 아닐경우");
			dispatcher = pool.Constant.VIEW + path + pool.Constant.JSP;
		}
		request.getRequestDispatcher(dispatcher).forward(request, response);
	}
}


