package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;
import sun.security.jca.GetInstance;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();

	private MemberDAOImpl() {
	}

	public static MemberDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void insertMember(MemberBean member) {
		try {
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(String.format(
					"INSERT INTO  member(id,name,pass,ssn)\n"
					+"VALUES('%s','%s','%s','%s')",
					member.getId(), member.getName(),
					member.getPass(), member.getSsn()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			
			String sql="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersbyname(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			String sql ="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberbyid(String id) {
		MemberBean member = new MemberBean();

		try {
			String sql ="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);

		} catch (Exception e) {

		}
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;

		try {
			String sql ="";
			DatabaseFactory.createDatebase("oracle").
			getConnection().
			createStatement().
			executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public void updateMember(MemberBean member) {
		try {
			String sql ="";
			DatabaseFactory.createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteMember(String id, String pass) {
		try {
			String sql ="";
			DatabaseFactory.
			createDatebase("oracle").
			getConnection().
			createStatement().
			executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
