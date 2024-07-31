package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User2DAO {

	private static User2DAO instance = new User2DAO();

	public static User2DAO getInstance() {
		return instance;
	}

	private User2DAO() {
	};

	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";

	// CRUD 메서드
	public void insertUser(User2VO vo) {

		String sql = "INSERT INTO `user2` VALUES (?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getAddr());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	};

	public User2VO selectUser(String uid) {

		String sql = "SELECT * FROM `user2` WHERE `uid` = ?";
		User2VO user = null;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			ResultSet rs = psmt.executeQuery();

			// 조회 결과가 1 또는 0 이기 때문에 while문 대신 if문으로 next()
			if (rs.next()) {
				user = new User2VO();
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

	public List<User2VO> selectUsers() {

		String sql = "SELECT * FROM `user2`";
		List<User2VO> users = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));

				users.add(vo);
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	};

	public int updateUser(User2VO vo) {

		String sql = "UPDATE `user2` SET `name` = ?, `birth` = ?, `addr` = ? WHERE `uid` = ?";
		int result = 0;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getBirth());
			psmt.setString(3, vo.getAddr());
			psmt.setString(4, vo.getUid());

			result = psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	};

	public int deleteUser(String uid) {

		String sql = "DELETE FROM `user2` WHERE `uid` = ?";
		int result = 0;

		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);

			result = psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	};
}
