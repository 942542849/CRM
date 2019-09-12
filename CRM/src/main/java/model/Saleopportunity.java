package model;


public class Saleopportunity {
	private int id;
	private String name;
	private int optstate;
	private String optcutel;
	private int optsuccess;
	private int customer_id;
	private String optdetail;
	private int user_id;
	private String customername;
	private String username;
	private String createtime;


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
	public int getOptstate() {
		return optstate;
	}
	public void setOptstate(int optstate) {
		this.optstate = optstate;
	}
	public String getOptcutel() {
		return optcutel;
	}
	public void setOptcutel(String optcutel) {
		this.optcutel = optcutel;
	}
	public int getOptsuccess() {
		return optsuccess;
	}
	public void setOptsuccess(int optsuccess) {
		this.optsuccess = optsuccess;
	}

	public String getOptdetail() {
		return optdetail;
	}
	public void setOptdetail(String optdetail) {
		this.optdetail = optdetail;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public static String[] getOptstates() {
		return optstates;
	}
	public static void setOptstates(String[] optstates) {
		Saleopportunity.optstates = optstates;
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
	public static String[]optstates= {"正在进行","失败","成功"};
	public String getOptstatename() {
		return optstates[optstate];
	}





	
}
