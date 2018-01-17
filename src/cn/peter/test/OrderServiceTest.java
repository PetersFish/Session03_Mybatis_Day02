package cn.peter.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.peter.pojo.Order;
import cn.peter.service.OrderService;

public class OrderServiceTest {
	private OrderService os = null;
	
	@Before
	public void init() {
		os = new OrderService();
	}

	@Test
	public void testGetOrderByUid() {
		List<Order> list = os.getOrderByUid(1);
		System.out.println(list);
	}

	@Test
	public void testListAll() {
		List<Order> list = os.listAll();
		System.out.println(list);
	}

}
