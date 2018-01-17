package cn.peter.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.peter.pojo.User;
import cn.peter.service.UserService;

public class UserServiceTest {
	UserService service = null;
	
	@Before
	public void init() {
		service = new UserService();
	}

	@Test
	public void testSave() {
		User user = new User();
		//user.setId(4);
		user.setUsername("wangcai");
		user.setPassword("666");
		Integer i = service.save(user);
		System.out.println(i);
	}

	@Test
	public void testGetUserById() {
		User user = service.getUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testGetUserById2() {
		User user = service.getUserById2(1);
		System.out.println(user);
	}
	
	@Test
	public void testGetUserById3() {
		User user = service.getUserById3(1);
		System.out.println(user);
	}
	
	@Test
	public void testListUserByName() {
		List<User> list = service.listUserByName("m");
		System.out.println(list);
	}
	
	@Test
	public void testListAll() {
		List<User> list = service.listAll();
		System.out.println(list);
		for (User user : list) {
			System.out.println(user.getAddress());
		}
	}
	
	@Test
	public void testListAll2() {
		List<User> list = service.listAll2();
		//System.out.println(list);
		for (User user : list) {
			System.out.println(user.getOrders());
		}
	}
	
	@Test
	public void testListBySelect1() {
		List<User> list = service.listBySelect1();
		//System.out.println(list);
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(3);
		user.setUsername("Mama");
		//user.setPassword("789");
		Integer i = service.update(user);
		System.out.println(i);
	}

	@Test
	public void testDeleteById() {
		Integer i = service.deleteById(10);
		System.out.println(i);
	}

}
