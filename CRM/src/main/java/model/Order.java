package model;


public class Order {
	private int id;
	
	private String name;
	private String createdate;
	private String compdate;
	private String orderdate;
	private String startdate;
	private String enddate;
	
	private int client_id;
	private String clientname;
	private int operator_id;
	private String operatorname;
	
	private String info;
	private String files;
	private String compoperatorids;
	private String compweight;
	
	private int statu;
	private Double amount;
	private String comments;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getCompdate() {
		return compdate;
	}
	public void setCompdate(String compdate) {
		this.compdate = compdate;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public String getOperatorname() {
		return operatorname;
	}
	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public String getCompoperatorids() {
		return compoperatorids;
	}
	public void setCompoperatorids(String compoperatorids) {
		this.compoperatorids = compoperatorids;
	}
	public String getCompweight() {
		return compweight;
	}
	public void setCompweight(String compweight) {
		this.compweight = compweight;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public static String[]status= {"未审核","已审核","暂缓","作废"};
	public String getStatuname() {
		return status[statu];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	

	
}
