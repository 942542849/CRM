package model;


public class Client {
	private int id;
	private String name;
	private int sex;
	private String tel;
	private String qq;
	private String email;
	private String address;
	private String infos;
	
	private int linkstatu;
	private int clientstatu;
	private int purposestatu;
	private int assessstatu;
	private int execstatu;
	private int statu;
	
	
	private int clienttype_id;
	private String clienttypename;
	
	private String operatorids;
	
	
	private int createoperator_id;
	private String createoperatorname;
	
	private String createdate;

	private int src_id;
	private String srcname;
	
	private int count;
	private String comments;

	private String operatornames;
	
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
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInfos() {
		return infos;
	}
	public void setInfos(String infos) {
		this.infos = infos;
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
	public int getClienttype_id() {
		return clienttype_id;
	}
	public void setClienttype_id(int clienttype_id) {
		this.clienttype_id = clienttype_id;
	}
	public String getClienttypename() {
		return clienttypename;
	}
	public void setClienttypename(String clienttypename) {
		this.clienttypename = clienttypename;
	}
	public String getOperatorids() {
		return operatorids;
	}
	public void setOperatorids(String operatorids) {
		this.operatorids = operatorids;
	}
	public int getCreateoperator_id() {
		return createoperator_id;
	}
	public void setCreateoperator_id(int createoperator_id) {
		this.createoperator_id = createoperator_id;
	}
	public String getCreateoperatorname() {
		return createoperatorname;
	}
	public void setCreateoperatorname(String createoperatorname) {
		this.createoperatorname = createoperatorname;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public int getSrc_id() {
		return src_id;
	}
	public void setSrc_id(int src_id) {
		this.src_id = src_id;
	}
	public String getSrcname() {
		return srcname;
	}
	public void setSrcname(String srcname) {
		this.srcname = srcname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	public static String[]sexs= {"未知","男","女"};
	public String getSexname() {
		return sexs[sex];
	}

	public static String[]linkstatus= {"未指定","秒挂","未接通","有交流","深入交流"};
	public String getLinkstatuname() {
		return linkstatus[linkstatu];
	}
	public static String[]clientstatus= {"未指定","排斥","排斥","后续","较好"};
	public String getClientstatuname() {
		return clientstatus[clientstatu];
	}
	public static String[]purposestatus= {"未指定","N","C","B","A","Y"};
	public String getPurposestatuname() {
		return purposestatus[purposestatu];
	}
	public static String[]assessstatus= {"未指定","截至","无果","有预约"};
	public String getAssessstatuname() {
		return assessstatus[assessstatu];
	}
	public static String[]execstatus= {"正常","转出","完成"};
	public String getExecstatuname() {
		return execstatus[execstatu];
	}
	public static String[]status= {"正常","公共","资料不全","无效"};
	public String getStatuname() {
		return status[statu];
	}
	public String getOperatornames() {
		return operatornames;
	}
	public void setOperatornames(String operatornames) {
		this.operatornames = operatornames;
	}
	
	
	//文件上传
	private int uploadstatus=0;
	public String getUploadstatusname() {
		return uploadstatus==0?"未上传":"成功";
	}
	public int getUploadstatus() {
		return uploadstatus;
	}
	public void setUploadstatus(int uploadstatus) {
           this.uploadstatus=uploadstatus;
	}

}
