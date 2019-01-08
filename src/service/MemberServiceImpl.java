package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}
	
	@Override
	public void crateMember(MemberBean bean) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("::컨트롤러에서 넘어온 회원정보::");
		System.out.println("ID :"+bean.getId());
		System.out.println("Name :"+bean.getName());
		System.out.println("Pass :"+bean.getPass());
		System.out.println("Ssn :"+bean.getSsn());
		MemberDAOImpl.getInstance().insertMember(bean);
	}

	@Override
	public ArrayList<MemberBean> listMembers() {
		 ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findbyname() {
		 ArrayList<MemberBean> list = new ArrayList<>();
			return list;
	}

	@Override
	public MemberBean findbyid(String id) {
		MemberBean bean = new MemberBean();
		
		return bean;
	}

	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public boolean existMember() {
		return false;
	}

	@Override
	public void updateMember() {
		
	}

	@Override
	public void deleteMember() {
		
	}

}
