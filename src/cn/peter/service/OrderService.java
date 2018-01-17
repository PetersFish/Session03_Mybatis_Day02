package cn.peter.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.peter.mapper.OrderMapper;
import cn.peter.pojo.Order;
import cn.peter.tools.DBUtils;

public class OrderService {

	private SqlSessionFactory sf = DBUtils.getSessionFactory();
	
	//select by id
	public List<Order> getOrderByUid(Integer id) {
		SqlSession session = sf.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<Order> list = mapper.getOrderByUid(id);
		return list;
	}
	
	//list orders
	public List<Order> listAll(){
		SqlSession session = sf.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<Order> list = mapper.listAll();
		return list;
	}

	
}
