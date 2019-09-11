package service;

import java.util.List;

import model.Level;
import utils.ReturnInfo;

public interface Level_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Level selectById(int id);
	public void insert(Level t);
	public void update(Level t);
	public void delete(int id);
	public List<Level> select();
}
