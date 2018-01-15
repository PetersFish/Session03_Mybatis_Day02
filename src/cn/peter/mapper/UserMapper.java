package cn.peter.mapper;

import cn.peter.pojo.User;

public interface UserMapper {

	//add user to database
	Integer save(User user);
	
	//select
	User getUserById(Integer id);
	
	//update
	Integer update(User user);
	
	//delete
	Integer deleteById(Integer id);
}
