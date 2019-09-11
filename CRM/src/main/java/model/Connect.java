package model;


public class Connect {
	private int id;
	private String name;
	private int sex;
	private String tel;
	private int customer_id;
	private String customername;
	private String comment;






	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String[]sexs= {"未知","男","女"};
	public String getSexname() {
		return sexs[sex];
	}


	

	
}
