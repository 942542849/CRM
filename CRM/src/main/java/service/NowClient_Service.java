package service;

import java.util.List;

import model.NowClient;
import utils.ReturnInfo;

public interface NowClient_Service {
	public int selectCount(String txt);
	public NowClient selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<NowClient> selectAll();
	public void insert(NowClient t);
	public void update(NowClient t);
	public void delete(int id);
	public List<NowClient> NowClient(String where, String lim);
}
