package service;

import java.util.List;

import model.ClientType;
import utils.ReturnInfo;

public interface ClientType_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public ClientType selectById(int id);
	public void insert(ClientType t);
	public void update(ClientType t);
	public void delete(int id);
	public List<ClientType> select();
}
