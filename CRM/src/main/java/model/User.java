package model;


public class User {
	private int id;
	private String name;
	private int sex;
	private String tel;
	private String pass;
	private int role_id;
	private int department_id;
	private String rolename;
	private String departmentname;
	private int status;

	public User(String name, String pass) {
		this.name=name;
		this.pass=pass;
	}

	public User() {
		
	}

	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	public String getDepartmentname() {
		return departmentname;
	}


	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}


	public int getRole_id() {
		return role_id;
	}


	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}


	public int getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
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
	public static String[]sexs= {"未知","男","女"};
	public String getSexname() {
		return sexs[sex];
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
