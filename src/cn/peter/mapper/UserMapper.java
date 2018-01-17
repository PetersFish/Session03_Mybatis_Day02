package cn.peter.mapper;


import java.util.List;
import java.util.Map;

import cn.peter.pojo.User;

public interface UserMapper {

	//add user to database
	Integer save(User user);
	
	//select
	User getUserById(Integer id);
	
	//select column
	User getUserById2(Integer id);
	
	//select column
	User getUserById3(Integer id);
	
	/*//select by map
	Map<Integer, User> getUserMap();*/
	
	//select by name
	List<User> listUserByName(String name);
	
	//list all users
	List<User> listAll();
	
	//list all users join orders
	List<User> listAll2();
	
	//list by select
	List<User> listBySelect1();
	
	//update
	Integer update(User user);
	
	//delete
	Integer deleteById(Integer id);
}
