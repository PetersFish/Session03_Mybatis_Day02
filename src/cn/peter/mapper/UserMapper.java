package cn.peter.mapper;


import java.util.List;

import cn.peter.pojo.User;

public interface UserMapper {

	//add user to database
	Integer save(User user);
	
	//select
	User getUserById(Integer id);
	
	//select by name
	List<User> listUserByName(String name);
	
	//update
	Integer update(User user);
	
	//delete
	Integer deleteById(Integer id);
}
