package service;

import java.util.List;

import model.WorkGroup;
import utils.ReturnInfo;

public interface WorkGroup_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public WorkGroup selectById(int id);
	public void insert(WorkGroup t);
	public void update(WorkGroup t);
	public void delete(int id);
	public List<WorkGroup> select();
}
