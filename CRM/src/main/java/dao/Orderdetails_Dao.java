package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import model.Orderdetails;





@Repository
public interface Orderdetails_Dao {
	@Select("select count(1) from (c_orderdetails inner join c_order on c_orderdetails.order_id=c_order.id)inner join c_product on c_orderdetails.product_id=c_product.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_orderdetails.*,c_order.name ordername,c_product.name productname from (c_orderdetails inner join c_order on c_orderdetails.order_id=c_order.id)inner join c_product on c_orderdetails.product_id=c_product.id where  c_orderdetails.id=#{id}")
	public Orderdetails selectById(int id); 
	@Select("select c_orderdetails.*,c_order.name ordername,c_product.name productname from (c_orderdetails inner join c_order on c_orderdetails.order_id=c_order.id)inner join c_product on c_orderdetails.product_id=c_product.id ${txt} ORDER BY c_orderdetails.id ${limit}")
	public List<Orderdetails> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_orderdetails.*,c_order.name ordername,c_product.name productname from (c_orderdetails inner join c_order on c_orderdetails.order_id=c_order.id)inner join c_product on c_orderdetails.product_id=c_product.id")
	public List<Orderdetails> selectAll();
	@Insert("insert into c_orderdetails (order_id,product_id,count,amount,disc,comments) values(#{order_id},#{product_id},#{count},#{amount},#{disc},#{comments}) ")
	public void insert(Orderdetails t);
	@Update("update c_orderdetails set order_id=#{order_id},product_id=#{product_id},count=#{count},amount=#{amount},disc=#{disc},comments=#{comments} where id= #{id}")
	public void update(Orderdetails t);
	@Delete("delete from c_orderdetails where id=#{id}")
	public void delete(int id);
}
