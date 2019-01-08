package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean bean);

	public ArrayList<MemberBean> selectMembers();

	public ArrayList<MemberBean> selectbyname();

	public MemberBean selectbyid();

	public int countMembers();

	public void updateMember();

	public void deleteMember();
}
