package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import domain.MemberBean;
import sun.security.jca.GetInstance;

public class MemberDAOImpl implements MemberDAO {
	
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private  MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	
	Connection conn;
	Statement stmt;
	ResultSet rs ;

	@Override
	public void insertMember(MemberBean bean) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO  member(id,name,pass,ssn)\n"
					+ "VALUES('%s','%s','%s','%s')",
					bean.getId(),bean.getName(),bean.getPass(),bean.getSsn()
					);
				System.out.println("SQL :::"+sql);
				//rs = stmt.executeQuery(sql);
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectbyname() {
		return null;
	}

	@Override
	public MemberBean selectbyid() {
		return null;
	}

	@Override
	public int countMembers() {
		return 0;
	}

	@Override
	public void updateMember() {

	}

	@Override
	public void deleteMember() {

	}

}
