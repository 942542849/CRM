package model;


public class Reserved {
	private int id;


	private String revisit_id;
	private String createdate;
	private String date;
	private String comments;
	
	public String getRevisit_id() {
		return revisit_id;
	}
	public void setRevisit_id(String revisit_id) {
		this.revisit_id = revisit_id;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public int getExecoperator_id() {
		return execoperator_id;
	}
	public void setExecoperator_id(int execoperator_id) {
		this.execoperator_id = execoperator_id;
	}
	public String getExecoperatorname() {
		return execoperatorname;
	}
	public void setExecoperatorname(String execoperatorname) {
		this.execoperatorname = execoperatorname;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}



	private int client_id;
	private String clientname;
	private int operator_id;
	private String operatorname;
	private int execoperator_id;
	private String execoperatorname;
	
	
	
	private int type;
	private int statu;
	private int execstatu;
	
	private String result;



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
	
	



	
	public static String[]types= {"回访预约","上门预约"};
	public String getTypename() {
		return types[type];
	}
	public static String[]status= {"未处理","已处理"};
	public String getStatuname() {
		return status[statu];
	}
	public static String[]execstatus= {"正常","违约","延期","转约"};
	public String getExecstatuname() {
		return execstatus[execstatu];
	}

}
