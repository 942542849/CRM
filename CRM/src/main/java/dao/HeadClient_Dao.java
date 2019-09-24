package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.HeadClient;






@Repository
public interface HeadClient_Dao {
	
	@Select("select count(1) from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id where c_client.id=#{id}")
	public HeadClient selectById(int id); 
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id ${txt} ORDER BY c_client.id ${limit}")
	public List<HeadClient> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id")
	public List<HeadClient> selectAll();
	@Insert("insert into c_client(name,sex,tel,qq,email,address,infos,linkstatu,clientstatu,purposestatu,assessstatu,execstatu,statu,clienttype_id,operatornames,operatorids,createoperator_id,createdate,src_id,count,comments) values(#{name},#{sex},#{tel},#{qq},#{email},#{address},#{infos},#{linkstatu},#{clientstatu},#{purposestatu},#{assessstatu},#{execstatu},#{statu},#{clienttype_id},#{operatornames},#{operatorids},#{createoperator_id},#{createdate},#{src_id},#{count},#{comments})")
	public void insert(HeadClient t);
	@Update("update c_client set operatorids=null ,operatornames=null  where id =#{id}")
	public void update(HeadClient t);
	@Delete("delete from c_client where id=#{id}")
	public void delete(int id);	
	@Select("select c_client.*,c_clienttype.name clienttypename,c_operator.name createoperatorname,c_src.name srcname from ((c_client inner join c_clienttype on c_client.clienttype_id=c_clienttype.id) inner join c_operator on c_client.createoperator_id=c_operator.id) inner join c_src on c_client.src_id=c_src.id where (c_client.operatorids != '' and c_client.operatorids IS not NULL and c_client.execstatu=0)${txt} ${limit}")
	public List<HeadClient> Head(@Param("txt") String txt,@Param("limit") String limit);
//	
//	@Select("select c_client.*,c_client_type.name clienttypename,c_user.name createusername from (c_client inner join c_client_type on c_client.clienttypeid = c_client_type.id) inner join c_user on c_client.createuserid = c_user.id where c_client.userids = '' or c_client.userids is null ${txt} ${lim}")
//	public List<Client> getNoappoint(@Param("txt")String where, @Param("lim")String limit);
}