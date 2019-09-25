package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Order;


@Repository
public interface Order_Dao {
	@Select("select count(1) from (c_order inner join c_client on c_order.client_id=c_client.id)inner join c_operator on c_order.operator_id=c_operator.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_order.*,c_client.name clientname,c_operator.name operatorname from (c_order inner join c_client on c_order.client_id=c_client.id)inner join c_operator on c_order.operator_id=c_operator.id where c_order.id=#{id}")
	public Order selectById(int id); 
	@Select("select c_order.*,c_client.name clientname,c_operator.name operatorname from (c_order inner join c_client on c_order.client_id=c_client.id)inner join c_operator on c_order.operator_id=c_operator.id ${txt} ORDER BY c_order.id ${limit}")
	public List<Order> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_order.*,c_client.name clientname,c_operator.name operatorname from (c_order inner join c_client on c_order.client_id=c_client.id)inner join c_operator on c_order.operator_id=c_operator.id ")
	public List<Order> selectAll();
	@Insert("insert into c_order(name,client_id,createdate,compdate,orderdate,startdate,enddate,operator_id,info,files,compoperatorids,compweight,statu,amount,comments) values(#{name},#{client_id},#{createdate},#{compdate},#{orderdate},#{startdate},#{enddate},#{operator_id},#{info},#{files},#{compoperatorids},#{compweight},#{statu},#{amount},#{comments})")
	public void insert(Order t);
	@Update("update c_order set  name=#{name},client_id=#{client_id},createdate=#{createdate},compdate=#{compdate},orderdate=#{orderdate},startdate=#{startdate},enddate=#{enddate},operator_id=#{operator_id},info=#{info},files=#{files},compoperatorids=#{compoperatorids},compweight=#{compweight},statu=#{statu},amount=#{amount},comments=#{comments} where id=#{id}")
	public void update(Order t);
	@Delete("delete from c_order where id=#{id}")
	public void delete(int id);
	
	@Select("select c_order.*,c_client.name clientname,c_operator.name operatorname from (c_order inner join c_client on c_order.client_id=c_client.id)inner join c_operator on c_order.operator_id=c_operator.id where client_id=#{client_id}")
	public Order getByClientId(int client_id);
}
