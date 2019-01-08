package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void crateMember(MemberBean bean);

	public ArrayList<MemberBean> listMembers();

	public ArrayList<MemberBean> findbyname();

	public MemberBean findbyid(String id);

	public int countMembers();

	public boolean existMember();

	public void updateMember();

	public void deleteMember();
}
