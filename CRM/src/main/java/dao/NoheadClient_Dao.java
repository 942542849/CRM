package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import model.NoheadClient;









@Repository
public interface NoheadClient_Dao {
	
	@Select("select count(1) from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id where c_client.id=#{id}")
	public NoheadClient selectById(int id); 
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id ${txt} ORDER BY c_client.id ${limit}")
	public List<NoheadClient> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id")
	public List<NoheadClient> selectAll();
	@Insert("insert into c_client(name,sex,tel,qq,email,address,infos,linkstatu,clientstatu,purposestatu,assessstatu,execstatu,statu,clienttype_id,operatornames,operatorids,createoperator_id,createdate,src_id,count,comments) values(#{name},#{sex},#{tel},#{qq},#{email},#{address},#{infos},#{linkstatu},#{clientstatu},#{purposestatu},#{assessstatu},#{execstatu},#{statu},#{clienttype_id},#{operatornames},#{operatorids},#{createoperator_id},#{createdate},#{src_id},#{count},#{comments})")
	public void insert(NoheadClient t);
	@Update("update c_client set name=#{name},sex=#{sex},tel=#{tel},qq=#{qq},email=#{email},address=#{address},infos=#{infos},linkstatu=#{linkstatu},clientstatu=#{clientstatu},purposestatu=#{purposestatu},assessstatu=#{assessstatu},execstatu=#{execstatu},statu=#{statu},clienttype_id=#{clienttype_id},operatornames=#{operatornames},operatorids=#{operatorids},createoperator_id=#{createoperator_id},createdate=#{createdate},src_id=#{src_id},count=#{count},comments=#{comments} where id =#{id}")
	public void update(NoheadClient t);
	@Delete("delete from c_client where id=#{id}")
	public void delete(int id);	
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id where c_client.operatorids = '' or c_client.operatorids is null ${txt} ${limit}")
	public List<NoheadClient> Nohead(@Param("txt") String txt,@Param("limit") String limit);
//	
//	@Select("select c_client.*,c_client_type.name clienttypename,c_user.name createusername from (c_client inner join c_client_type on c_client.clienttypeid = c_client_type.id) inner join c_user on c_client.createuserid = c_user.id where c_client.userids = '' or c_client.userids is null ${txt} ${lim}")
//	public List<Client> getNoappoint(@Param("txt")String where, @Param("lim")String limit);
}