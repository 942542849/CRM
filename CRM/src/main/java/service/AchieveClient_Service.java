package service;

import java.util.List;

import model.AchieveClient;
import utils.ReturnInfo;

public interface AchieveClient_Service {
	public int selectCount(String txt);
	public AchieveClient selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<AchieveClient> selectAll();
	public void insert(AchieveClient t);
	public void update(AchieveClient t);
	public void delete(int id);
	public ReturnInfo Achieve(String txt,Integer limit,Integer page);
}
