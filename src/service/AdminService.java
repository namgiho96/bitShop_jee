package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void Crate();

	public ArrayList<AdminBean> alllist();

	public ArrayList<AdminBean> findbyname();

	public AdminBean findbyid();

	public int count();

	public boolean exist();

	public void update();

	public void delete();
}
