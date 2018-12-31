package service;

import java.util.ArrayList;

import domain.MemberBean;



public interface MemberService {
	public void crate();
	public ArrayList<MemberBean> list();
	public ArrayList<MemberBean> findbyname();
	public MemberBean findbyid();
	public int count();
	public boolean exist();
	public void update();
	public void delete();
}
