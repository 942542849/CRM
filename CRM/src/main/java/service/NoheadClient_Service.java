package service;

import java.util.List;

import model.NoheadClient;
import utils.ReturnInfo;

public interface NoheadClient_Service {
	public int selectCount(String txt);
	public NoheadClient selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<NoheadClient> selectAll();
	public void insert(NoheadClient t);
	public void update(NoheadClient t);
	public void delete(int id);
	public ReturnInfo Nohead(String txt,Integer limit,Integer page);
	public int updates(String clientid, String operatorids, String operatornames);
	
}
