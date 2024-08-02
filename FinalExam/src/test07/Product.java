package test07;

public class Product {

	protected String prodId;
	protected String prodName;
	protected int price;
	protected int quantity;
	
	public Product(String prodId, String prodName, int price, int quantity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	protected void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품이름 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
}
