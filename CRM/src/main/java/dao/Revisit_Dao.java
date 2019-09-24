package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Revisit;

@Repository
public interface Revisit_Dao {
	@Select("select count(1) from c_revisit inner join c_client on c_revisit.client_id=c_client.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_revisit.*,c_client.name clientname from c_revisit inner join c_client on c_revisit.client_id=c_client.id where c_revisit.id=#{id}")
	public Revisit selectById(int id); 
	@Select("select c_revisit.*,c_client.name clientname from c_revisit inner join c_client on c_revisit.client_id=c_client.id ${txt} ORDER BY c_revisit.id ${limit}")
	public List<Revisit> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_revisit.*,c_client.name clientname from c_revisit inner join c_client on c_revisit.client_id=c_client.id")
	public List<Revisit> selectAll();
	@Insert("insert into c_revisit(client_id,linkstatu,clientstatu,purposestatu,assessstatu,execstatu,askinfo,followinfo,probleminfo,statu,comments) values(#{client_id},#{linkstatu},#{clientstatu},#{purposestatu},#{assessstatu},#{execstatu},#{askinfo},#{followinfo},#{probleminfo},#{statu},#{comments})")
	public void insert(Revisit t);
	@Update("update c_revisit set client_id=#{client_id},linkstatu=#{linkstatu},clientstatu=#{clientstatu},purposestatu=#{purposestatu},assessstatu=#{assessstatu},execstatu=#{execstatu},askinfo=#{askinfo},followinfo=#{followinfo},probleminfo=#{probleminfo},statu=#{statu},comments=#{comments} where id =#{id}")
	public void update(Revisit t);
	@Delete("delete from c_revisit where id=#{id}")
	public void delete(int id);
	//以下为业务
	@Select("select count(1) from c_revisit inner join c_client on c_revisit.client_id=c_client.id ${txt}")
	public int selectMyCount(@Param("txt")String where);
	@Select("select c_revisit.*,c_client.name clientname from c_revisit inner join c_client on c_revisit.client_id=c_client.id ${txt} ${lim}")
	public List<Revisit> getAllById(@Param("txt")String where, @Param("lim")String limit);
}
