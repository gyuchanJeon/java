package shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}

	private ProductDAO() {
	}

	int result = 0;

	public int insertProduct(ProductVO vo) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setInt(1, vo.getProdNo());
			psmt.setString(2, vo.getProdName());
			psmt.setInt(3, vo.getStock());
			psmt.setInt(4, vo.getPrice());
			psmt.setString(5, vo.getCompany());
			result = psmt.executeUpdate();

			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public ProductVO selectProduct(int prodNo) {

		ProductVO vo = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setInt(1, prodNo);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	public List<ProductVO> selectProducts() {

		List<ProductVO> products = new ArrayList<>();

		try {
			conn = getConnection();

			psmt = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));

				products.add(vo);
			}

			closeAll();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

	public int updateProduct(ProductVO vo) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT);
			psmt.setString(1, vo.getProdName());
			psmt.setInt(1, vo.getStock());
			psmt.setInt(1, vo.getPrice());
			psmt.setString(1, vo.getCompany());
			psmt.setInt(1, vo.getProdNo());
			result = psmt.executeUpdate();

			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int deleteProduct(int prodNo) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_PRODUCT);
			psmt.setInt(1, prodNo);
			result = psmt.executeUpdate();

			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
