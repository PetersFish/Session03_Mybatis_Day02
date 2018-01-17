package cn.peter.mapper;

import java.util.List;

import cn.peter.pojo.Order;

public interface OrderMapper {
	
	//select by id
	List<Order> getOrderByUid(Integer id);
	
	//list orders
	List<Order> listAll();
}
