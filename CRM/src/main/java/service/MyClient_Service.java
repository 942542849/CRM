package service;

import java.util.List;

import model.MyClient;
import utils.ReturnInfo;

public interface MyClient_Service {
	public int selectCount(String txt);
	public MyClient selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<MyClient> selectAll();
	public void insert(MyClient t);
	public void update(MyClient t);
	public void delete(int id);
	public List<MyClient> NowClient(String where, String lim);
	public int remove(MyClient u);
	public MyClient getAllById(int client_id);
}
