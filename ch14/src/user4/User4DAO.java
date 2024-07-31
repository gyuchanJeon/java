package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User4DAO {

	private static User4DAO instance = new User4DAO();

	public static User4DAO getInstance() {
		return instance;
	}

	private User4DAO() {
	};

	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";

	// CRUD 메서드

	public void insertUser(User4VO vo) {

		String sql = "INSERT INTO `user4` VALUES (?,?,?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getGender());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getHp());
			psmt.setString(6, vo.getAddr());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User4VO selectUser(String uid) {

		String sql = "SELECT * FROM `user4` WHERE `uid` = ?";
		User4VO user = null;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			ResultSet rs = psmt.executeQuery();

			// 조회 결과가 1 또는 0 이기 때문에 while문 대신 if문으로 next()
			if (rs.next()) {
				user = new User4VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setHp(rs.getString(5));
				user.setAddr(rs.getString(6));
			}
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	};

	public List<User4VO> selectUsers() {

		String sql = "select * from `user4`";
		List<User4VO> users = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				User4VO vo = new User4VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setHp(rs.getString(5));
				vo.setAddr(rs.getString(6));

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

	public int updateUser(User4VO vo) {

		String sql = "update `user4` set `name`=?, `gender`=?, `age`=?, `hp`=?, `addr`=? where `uid`=?";
		int result = 0;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getGender());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getHp());
			psmt.setString(5, vo.getAddr());
			psmt.setString(6, vo.getUid());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteUser(String uid) {

		String sql = "delete from `user4` where `uid` = ?";
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
