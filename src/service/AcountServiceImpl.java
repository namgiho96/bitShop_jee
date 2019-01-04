package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import domain.AccountBean;

public class AcountServiceImpl implements AcountService {

	private ArrayList<AccountBean> list;

	public AcountServiceImpl() {
		list = new ArrayList<>();
	}

	public String openAccountNum(int money) {
		String accNum = "";
		AccountBean bean = new AccountBean();
		bean.setAccountNum(createAccountNum());
		bean.setMoney(money);
		bean.setToday(date());
		list.add(bean);
		accNum = bean.getAccountNum();

		return accNum;

	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		return random.nextInt(8999) + 1001 + "";

	}

	@Override
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(date);
	}

	@Override
	public ArrayList<AccountBean> findbyid() {
		return null;
	}

	@Override
	public AccountBean findcount() {
		return null;
	}

	@Override
	public boolean updateDeposit(String accountnum, int money) {
		return false;
	}

	@Override
	public void updateWithdrawal(String accountnum, int money) {

	}

	@Override
	public void delete() {

	}

}
