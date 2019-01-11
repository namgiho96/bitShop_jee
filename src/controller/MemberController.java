package controller;

import java.io.IOException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberService memberService = MemberServiceImpl.getInstance();
		MemberBean member = null;
		System.out.println("맴버 들어옴");
		
		/**
		 디폴트 값
		CMD :move
		DIR :member
		page:main
		dest:NONE
		 * **/
		
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
		System.out.println("CMD"+cmd);
		HttpSession session  = request.getSession();
		
		
		switch (cmd) {
		case "login":
			member = new MemberBean();
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			boolean loginok = memberService.existMember(id,pass);
			
			if (loginok) {
				System.out.println("로그인성공");
				session.setAttribute("user",memberService.findMemberByid(id));
				
			}else {
				System.out.println("로그인실패");
				dir = "";
				page = "index";
				
			}
			break;

		case "move":
			System.out.println("(1).무브들어옴");
			String dest = request.getParameter("dest");
			if (dest == null) {
				dest = "NONE";
			}
			request.setAttribute("dest", dest);
			break;
		case "join":
			System.out.println("(join 들어옴)");
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setPass(request.getParameter("pass"));
			member.setName(request.getParameter("name"));
			member.setSsn(request.getParameter("ssn"));
			memberService.crateMember(member);
			session.setAttribute("member",memberService.findMemberByid(member.getId()));
			System.out.println(">>>>>>>>> 조회결과"+member.toString());
			break;
		case "logout":
			System.out.println("로그아웃!!");
			dir = "";
			page = "index";
			dest = "";
			session.invalidate();
			break;
		case "detail":
			dir = "member";
			page = "main";
			request.setAttribute("dest","detail");
			dest = getInitParameter("dest");
			System.out.println("detail dest는 : "+dest);
		/*	id = request.getParameter("id");
			request.setAttribute("member",memberService.findMemberByid(id));*/
			break;
		}
		Command.move(request,response, dir, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
