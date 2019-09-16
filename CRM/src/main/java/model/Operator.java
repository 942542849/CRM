package model;


public class Operator {
	private int id;
	private String name;
	private int power;
	private String tel;
	private String pass;
	private int group_id;
	private String groupname;
	private int status;
	

	



	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	

	public static String[] getStatuss() {
		return statuss;
	}

	public static void setStatuss(String[] statuss) {
		Operator.statuss = statuss;
	}

	public Operator(String tel, String pass) {
		this.tel=tel;
		this.pass=pass;
	}

	public Operator() {
		
	}

	
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
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
	public static String[]powers= {"管理员","组长","组员"};
	public String getPowername() {
		return powers[power];
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	public static String[]statuss= {"账号锁死","账号正常"};
	public String getStatusname() {
		return statuss[status];
	}
	
}
