package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void joinMember();

	public ArrayList<MemberBean> listMembers();

	public ArrayList<MemberBean> findbyname();

	public MemberBean findbyid();

	public int countMembers();

	public boolean existMember();

	public void updateMember();

	public void deleteMember();
}
