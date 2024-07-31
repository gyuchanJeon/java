package shop.dao;

import java.sql.SQLException;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	private static OrderDAO instance = new OrderDAO();

	public static OrderDAO getInstance() {
		return instance;
	}

	private OrderDAO() {
	}

	// 기본 CRUD 메서드
	public int insertOrder(OrderVO vo) {
		
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setInt(1, vo.getOrderNo());
			psmt.setString(2, vo.getOrderId());
			psmt.setInt(3, vo.getOrderProduct());
			psmt.setInt(4, vo.getOrderCount());
			psmt.setString(5, vo.getOrderDate());
			count = psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public OrderVO selectProduct(String orderNo) {
		
		OrderVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDER);
			psmt.setString(1, orderNo);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));
				vo.setOrderId(rs.getString(2));
				vo.setOrderProduct(rs.getInt(3));
				vo.setOrderCount(rs.getInt(4));
				vo.setOrderDate(rs.getString(5));
			}
			closeAll();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public List<OrderVO> selectCustomers() {
		return null;
	}

	public int updateCustomer(OrderVO vo) {
		return 0;
	}

	public int deleteCustomer(String custid) {
		return 0;
	}

}
