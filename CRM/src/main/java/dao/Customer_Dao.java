package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Customer;





@Repository
public interface Customer_Dao {
	@Select("select count(1) from((( crm_customer inner join crm_user on crm_user.id=crm_customer.user_id) inner join crm_customer_level on crm_customer.level_id =crm_customer_level.id) inner join crm_customer_pleased on crm_customer.pleased_id =crm_customer_pleased.id) inner join crm_customer_credit on crm_customer.credit_id =crm_customer_credit.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select crm_customer.*,crm_user.name username,crm_customer_level.name levelname,crm_customer_pleased.name pleasedname,crm_customer_credit.name creditname from ((( crm_customer inner join crm_user on crm_user.id=crm_customer.user_id) inner join crm_customer_level on crm_customer.level_id =crm_customer_level.id) inner join crm_customer_pleased on crm_customer.pleased_id =crm_customer_pleased.id) inner join crm_customer_credit on crm_customer.credit_id =crm_customer_credit.id where crm_customer.id=#{id}")
	public Customer selectById(int id); 
	@Select("select crm_customer.*,crm_user.name username,crm_customer_level.name levelname,crm_customer_pleased.name pleasedname,crm_customer_credit.name creditname from ((( crm_customer inner join crm_user on crm_user.id=crm_customer.user_id) inner join crm_customer_level on crm_customer.level_id =crm_customer_level.id) inner join crm_customer_pleased on crm_customer.pleased_id =crm_customer_pleased.id) inner join crm_customer_credit on crm_customer.credit_id =crm_customer_credit.id ${txt} ORDER BY crm_customer.id ${limit}")
	public List<Customer> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select crm_customer.*,crm_user.name username,crm_customer_level.name levelname,crm_customer_pleased.name pleasedname,crm_customer_credit.name creditname from ((( crm_customer inner join crm_user on crm_user.id=crm_customer.user_id) inner join crm_customer_level on crm_customer.level_id =crm_customer_level.id) inner join crm_customer_pleased on crm_customer.pleased_id =crm_customer_pleased.id) inner join crm_customer_credit on crm_customer.credit_id =crm_customer_credit.id")
	public List<Customer> selectAll();
	@Insert("insert into crm_customer(name,tel,area,user_id,level_id,pleased_id,credit_id,address) values(#{name},#{tel},#{area},#{user_id},#{level_id},#{pleased_id},#{credit_id},#{address})")
	public void insert(Customer t);
	@Update("update crm_customer set name=#{name},tel=#{tel},area=#{area},user_id=#{user_id},level_id=#{level_id},pleased_id=#{pleased_id},credit_id=#{credit_id},address=#{address} where id=#{id}")
	public void update(Customer t);
	@Delete("delete from crm_customer where id=#{id}")
	public void delete(int id);
}