package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		String accNum = "";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				accNum += random.nextInt(10) + "-";
			} else {
				accNum += random.nextInt(10);
			}
		}
		return accNum;

	}

	@Override
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(date);
	}

	@Override
	public ArrayList<AccountBean> accountlist() {
		return list;
	}

	@Override
	public AccountBean findcount(String accountNum) {

		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (accountNum.equals(list.get(i).getAccountNum())) {
				account = list.get(i);
				break;
			}
		}
		return account;
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
