package model;


public class Orderdetails {
	private int id;

	private int order_id;
	private String ordername;
	private int product_id;
	private String productname;
	private Double count;
	private Double amount;
	private Double disc;
	private String comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String odername) {
		this.ordername = odername;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDisc() {
		return disc;
	}
	public void setDisc(Double desc) {
		this.disc = desc;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}






	

	
}
