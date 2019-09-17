package service;

import java.util.List;

import model.Client;
import utils.ReturnInfo;

public interface Client_Service {
	public int selectCount(String txt);
	public Client selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Client> selectAll();
	public void insert(Client t);
	public void update(Client t);
	public void delete(int id);
}
