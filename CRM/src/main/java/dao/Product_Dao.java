package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Product;





@Repository
public interface Product_Dao {
	@Select("select*from c_product where id=#{id}")
	public Product selectById(int id);
	@Select("select*from c_product ${txt} ${limit}")
	public List<Product> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from c_product")
	public List<Product> select();
	@Insert("insert into c_product(name,amount,info) values(#{name},#{amount},#{info})")
	public void insert(Product t);
	@Update("update c_product set name=#{name},amount=#{amount},info=#{info} where id=#{id}")
	public void update(Product t);
	@Delete("delete from c_product where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from c_product ${txt}")
	public int selectCount(@Param("txt") String txt);
}
