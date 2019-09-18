package service;

import java.util.List;

import model.Revisit;
import utils.ReturnInfo;

public interface Revisit_Service {
	public int selectCount(String txt);
	public Revisit selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Revisit> selectAll();
	public void insert(Revisit t);
	public void update(Revisit t);
	public void delete(int id);
}
