package service;

import java.util.ArrayList;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();

	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	MemberDAOImpl dao;

	@Override
	public void crateMember(MemberBean bean) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("::컨트롤러에서 넘어온 회원정보::");
		System.out.println("ID :" + bean.getId());
		System.out.println("Name :" + bean.getName());
		System.out.println("Pass :" + bean.getPass());
		System.out.println("Ssn :" + bean.getSsn());
		dao.insertMember(bean);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberByid(String id) {
		MemberBean member = dao.selectMemberbyid(id);

		return member;
	}

	@Override
	public int countMembers() {

		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		return false;
	}

	@Override
	public void changeMember(MemberBean member) {

	}

	@Override
	public void removeMember(String id, String pass) {

	}

}
