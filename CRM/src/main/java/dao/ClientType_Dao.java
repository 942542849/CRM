package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.ClientType;





@Repository
public interface ClientType_Dao {
	@Select("select*from c_clienttype where id=#{id}")
	public ClientType selectById(int id);
	@Select("select*from c_clienttype ${txt} ${limit}")
	public List<ClientType> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from c_clienttype")
	public List<ClientType> select();
	@Insert("insert into c_clienttype(name) values(#{name})")
	public void insert(ClientType t);
	@Update("update c_clienttype set name=#{name} where id=#{id}")
	public void update(ClientType t);
	@Delete("delete from c_clienttype where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from c_clienttype ${txt}")
	public int selectCount(@Param("txt") String txt);
}
