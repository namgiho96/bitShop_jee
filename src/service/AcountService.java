package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AcountService {

	public String openAccountNum(int money);

	public String createAccountNum();

	public String date();

	public ArrayList<AccountBean> findbyid();

	public AccountBean findcount();

	public boolean updateDeposit(String accountnum,int money);

	public void updateWithdrawal(String accountnum,int money);

	public void delete();

}
