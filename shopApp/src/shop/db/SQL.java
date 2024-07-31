package shop.db;

public class SQL {

	public static final String INSERT_CUSTOMER = "insert into `customer` set "
												+ "`custid`=?, "
												+ "`name`=?, "
												+ "`hp`=?, "
												+ "`addr`=?, "
												+ "`rdate`=NOW()";
	
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custid`=?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `customer` set "
												+ "`name`=?, "
												+ "`hp`=?, "
												+ "`addr`=? "
												+ "where `custid`=?";
	public static final String DELETE_CUSTOMER = "delete from `customer` where `custid`=?";
	
	// product
	
	public static final String INSERT_PRODUCT = "insert into `product` set "
												+ "`prodNo`=?, "
												+ "`prodName`=?, "
												+ "`stock`=?, "
												+ "`price`=?, "
												+ "`company`=?";
	
	public static final String SELECT_PRODUCT = "select * from `product` where `prodNo`=?";
	public static final String SELECT_PRODUCTS = "select * from `product`";
	public static final String UPDATE_PRODUCT = "update `product` set "
												+ "`prodName`=?, "
												+ "`stock`=?, "
												+ "`price`=? "
												+ "where `prodNo`=?";
	public static final String DELETE_PRODUCT = "delete from `product` where `prodNo`=?";
	
	
	// order
	
	public static final String INSERT_ORDER = "insert into `order` set "
			+ "`orderNo`=?, "
			+ "`orderId`=?, "
			+ "`orderProduct`=?, "
			+ "`orderCount`=?, "
			+ "`orderDate`=NOW()";
	
	public static final String SELECT_ORDER = "select * from `order` where `orderNo`=?";
	public static final String SELECT_ORDERS = "select * from `order`";
	public static final String UPDATE_ORDER = "update `order` set "
			+ "`orderId`=?, "
			+ "`orderProduct`=?, "
			+ "`orderCount`=? "
			+ "where `orderNo`=?";
	public static final String DELETE_ORDER = "delete from `order` where `orderNo`=?";
	
	
	
	
}
