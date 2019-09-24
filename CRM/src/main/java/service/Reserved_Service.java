package service;

import java.util.List;

import model.Reserved;
import utils.ReturnInfo;

public interface Reserved_Service {
	public int selectCount(String txt);
	public Reserved selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Reserved> selectAll();
	public void insert(Reserved t);
	public void update(Reserved t);
	public void delete(int id);
	public int selectMyCount(String where);
	public List<Reserved> getMyreserved(String where, String lim);
}
