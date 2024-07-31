package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User3DAO {

	private static User3DAO instance = new User3DAO();

	public static User3DAO getInstance() {
		return instance;
	}

	private User3DAO() {
	};

	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";

	// CRUD 메서드

	public void insertUser(User3VO vo) {

		String sql = "INSERT INTO `user3` VALUES (?,?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setString(5, vo.getAddr());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User3VO selectUser(String uid) {

		String sql = "SELECT * FROM `user3` WHERE `uid` = ?";
		User3VO user = null;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			ResultSet rs = psmt.executeQuery();

			// 조회 결과가 1 또는 0 이기 때문에 while문 대신 if문으로 next()
			if (rs.next()) {
				user = new User3VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			}
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	};

	public List<User3VO> selectUsers() {

		String sql = "select * from `user3`";
		List<User3VO> users = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				User3VO vo = new User3VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAddr(rs.getString(5));

				users.add(vo);
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public int updateUser(User3VO vo) {

		String sql = "update `user3` set `name`=?, `birth`=?, `hp`=?, `addr`=? where `uid`=?";
		int result = 0;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getBirth());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			psmt.setString(5, vo.getUid());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteUser(String uid) {

		String sql = "delete from `user3` where `uid` = ?";
		int result = 0;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

}
