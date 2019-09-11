package service;

import java.util.List;

import model.Connect;
import utils.ReturnInfo;

public interface Connect_Service {
	public int selectCount(String txt);
	public Connect selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Connect> selectAll();
	public void insert(Connect t);
	public void update(Connect t);
	public void delete(int id);
}
