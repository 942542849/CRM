package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Reserved;



@Repository
public interface Reserved_Dao {
	@Select("select count(1)  FROM((c_reserved INNER JOIN c_operator on c_reserved.operator_id=c_operator.id)INNER JOIN c_operator m on c_reserved.execoperator_id=m.id)inner join c_client on c_reserved.client_id=c_client.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_reserved.*,c_client.name clientname,c_operator.name operatorname,m.name execoperatorname FROM((c_reserved INNER JOIN c_operator on c_reserved.operator_id=c_operator.id)INNER JOIN c_operator m on c_reserved.execoperator_id=m.id)inner join c_client on c_reserved.client_id=c_client.id where c_reserved.id=#{id}")
	public Reserved selectById(int id); 
	@Select("select c_reserved.*,c_client.name clientname,c_operator.name operatorname,m.name execoperatorname FROM((c_reserved INNER JOIN c_operator on c_reserved.operator_id=c_operator.id)INNER JOIN c_operator m on c_reserved.execoperator_id=m.id)inner join c_client on c_reserved.client_id=c_client.id  ${txt} ORDER BY c_reserved.id ${limit}")
	public List<Reserved> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_reserved.*,c_client.name clientname,c_operator.name operatorname,m.name execoperatorname FROM((c_reserved INNER JOIN c_operator on c_reserved.operator_id=c_operator.id)INNER JOIN c_operator m on c_reserved.execoperator_id=m.id)inner join c_client on c_reserved.client_id=c_client.id")
	public List<Reserved> selectAll();
	@Insert("insert into c_reserved(revisit_id,client_id,createdate,operator_id,date,execoperator_id,type,statu,execstatu,result) values(#{revisit_id},#{client_id},#{createdate},#{operator_id},#{date},#{execoperator_id},#{type},#{statu},#{execstatu},#{result})")
	public void insert(Reserved t);
	@Update("update c_reserved set revisit_id=#{revisit_id},client_id=#{client_id},createdate=#{createdate},operator_id=#{operator_id},date=#{date},execoperator_id=#{execoperator_id},type=#{type},statu=#{statu},execstatu=#{execstatu},result=#{result} where id =#{id}")
	public void update(Reserved t);
	@Delete("delete from c_reserved where id=#{id}")
	public void delete(int id);
}
