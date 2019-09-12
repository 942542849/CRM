package service;

import java.util.List;

import model.Saleopportunity;
import utils.ReturnInfo;

public interface Saleopportunity_Service {
	public int selectCount(String txt);
	public Saleopportunity selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Saleopportunity> selectAll();
	public void insert(Saleopportunity t);
	public void update(Saleopportunity t);
	public void delete(int id);
}
