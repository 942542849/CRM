package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Connect;





@Repository
public interface Connect_Dao {
	@Select("select count(1) from crm_customer_connect inner join crm_customer on crm_customer_connect.customer_id=crm_customer.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select crm_customer_connect.*,crm_customer.name customername from crm_customer_connect inner join crm_customer on crm_customer_connect.customer_id=crm_customer.id where crm_customer_connect.id=#{id}")
	public Connect selectById(int id); 
	@Select("select crm_customer_connect.*,crm_customer.name customername from crm_customer_connect inner join crm_customer on crm_customer_connect.customer_id=crm_customer.id ${txt} ORDER BY crm_customer_connect.id ${limit}")
	public List<Connect> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select crm_customer_connect.*,crm_customer.name customername from crm_customer_connect inner join crm_customer on crm_customer_connect.customer_id=crm_customer.id")
	public List<Connect> selectAll();
	@Insert("insert into crm_customer_connect(name,sex,tel,customer_id,comment) values(#{name},#{sex},#{tel},#{customer_id},#{comment})")
	public void insert(Connect t);
	@Update("update crm_customer_connect set name=#{name},sex=#{sex},tel=#{tel},customer_id=#{customer_id},comment=#{comment} where id=#{id}")
	public void update(Connect t);
	@Delete("delete from crm_customer_connect where id=#{id}")
	public void delete(int id);
}
