package service;

import java.util.List;

import model.Oppstate;
import utils.ReturnInfo;

public interface Oppstate_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Oppstate selectById(int id);
	public void insert(Oppstate t);
	public void update(Oppstate t);
	public void delete(int id);
	public List<Oppstate> select();
}
