package service;

import java.util.ArrayList;

import domain.AcountBean;

public interface AcountService {

	public void acountMake();

	public void acountlist();

	public ArrayList<AcountBean> findbyname();

	public ArrayList<AcountBean> findbyid();

	public AcountBean findcount();

	public boolean exist();

	public void update();

	public void delete();

}
