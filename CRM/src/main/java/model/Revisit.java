package model;


public class Revisit {
	private int id;


	private String askinfo;
	private String followinfo;
	private String probleminfo;
	private String comments;
	
	private int client_id;
	private String clientname;
	
	private int linkstatu;
	private int clientstatu;
	private int purposestatu;
	private int assessstatu;
	private int execstatu;
	private int statu;
	
	




	
	public String getAskinfo() {
		return askinfo;
	}
	public void setAskinfo(String askinfo) {
		this.askinfo = askinfo;
	}
	public String getFollowinfo() {
		return followinfo;
	}
	public void setFollowinfo(String followinfo) {
		this.followinfo = followinfo;
	}
	public String getProbleminfo() {
		return probleminfo;
	}
	public void setProbleminfo(String probleminfo) {
		this.probleminfo = probleminfo;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getLinkstatu() {
		return linkstatu;
	}
	public void setLinkstatu(int linkstatu) {
		this.linkstatu = linkstatu;
	}
	public int getClientstatu() {
		return clientstatu;
	}
	public void setClientstatu(int clientstatu) {
		this.clientstatu = clientstatu;
	}
	public int getPurposestatu() {
		return purposestatu;
	}
	public void setPurposestatu(int purposestatu) {
		this.purposestatu = purposestatu;
	}
	public int getAssessstatu() {
		return assessstatu;
	}
	public void setAssessstatu(int assessstatu) {
		this.assessstatu = assessstatu;
	}
	public int getExecstatu() {
		return execstatu;
	}
	public void setExecstatu(int execstatu) {
		this.execstatu = execstatu;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	


	public static String[]linkstatus= {"秒挂","未接通","有交流","深入交流"};
	public String getLinkstatuname() {
		return linkstatus[linkstatu];
	}
	public static String[]clientstatus= {"排斥","排斥","后续","较好"};
	public String getClientstatuname() {
		return clientstatus[clientstatu];
	}
	public static String[]purposestatus= {"N","C","B","A","Y"};
	public String getPurposestatuname() {
		return purposestatus[purposestatu];
	}
	public static String[]assessstatus= {"截至","无果","有预约"};
	public String getAssessstatuname() {
		return assessstatus[assessstatu];
	}
	public static String[]execstatus= {"跟进措施","客户顾虑"};
	public String getExecstatuname() {
		return execstatus[execstatu];
	}
	public static String[]status= {"正常","隐藏"};
	public String getStatuname() {
		return status[statu];
	}

}
