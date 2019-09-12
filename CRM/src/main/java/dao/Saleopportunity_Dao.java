package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Saleopportunity;




@Repository
public interface Saleopportunity_Dao {
	@Select("select count(1) from( crm_sale_opportunity inner join crm_customer on crm_customer.id=crm_sale_opportunity.customer_id) inner join crm_user on crm_user.id =crm_sale_opportunity.user_id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select crm_sale_opportunity.*,crm_customer.name customername,crm_user.name username from ( crm_sale_opportunity inner join crm_customer on crm_customer.id=crm_sale_opportunity.customer_id) inner join crm_user on crm_user.id =crm_sale_opportunity.user_id where crm_sale_opportunity.id=#{id}")
	public Saleopportunity selectById(int id); 
	@Select("select crm_sale_opportunity.*,crm_customer.name customername,crm_user.name username from ( crm_sale_opportunity inner join crm_customer on crm_customer.id=crm_sale_opportunity.customer_id) inner join crm_user on crm_user.id =crm_sale_opportunity.user_id ${txt} ORDER BY crm_sale_opportunity.id ${limit}")
	public List<Saleopportunity> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select crm_sale_opportunity.*,crm_customer.name customername,crm_user.name username from ( crm_sale_opportunity inner join crm_customer on crm_customer.id=crm_sale_opportunity.customer_id) inner join crm_user on crm_user.id =crm_sale_opportunity.user_id")
	public List<Saleopportunity> selectAll();
	@Insert("insert into crm_sale_opportunity(name,customer_id,optcutel,optsuccess,optstate,optdetail,user_id,createtime) values(#{name},#{customer_id},#{optcutel},#{optsuccess},#{optstate},#{optdetail},#{user_id},#{createtime})")
	public void insert(Saleopportunity t);
	@Update("update crm_sale_opportunity set name=#{name},customer_id=#{customer_id},optcutel=#{optcutel},optsuccess=#{optsuccess},optstate=#{optstate},optdetail=#{optdetail},user_id=#{user_id},createtime=#{createtime} where id=#{id}")
	public void update(Saleopportunity t);
	@Delete("delete from crm_sale_opportunity where id=#{id}")
	public void delete(int id);
}
