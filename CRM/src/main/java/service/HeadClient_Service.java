package service;

import java.util.List;

import model.HeadClient;
import utils.ReturnInfo;

public interface HeadClient_Service {
	public int selectCount(String txt);
	public HeadClient selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<HeadClient> selectAll();
	public void insert(HeadClient t);
	public void update(HeadClient t);
	public void delete(int id);
	public ReturnInfo Head(String txt,Integer limit,Integer page);
}
