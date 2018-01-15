package cn.peter.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.peter.mapper.UserMapper;
import cn.peter.pojo.User;
import cn.peter.tools.DBUtils;

public class UserService {

	private SqlSessionFactory sf = DBUtils.getSessionFactory();
	
	//save
	public Integer save(User user) {
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		Integer save = mapper.save(user);
		session.close();
		return save;
	}
	
	//select by id
	public User getUserById(Integer id) {
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.getUserById(id);
		session.close();
		return user;
	}
	
	//update
	public Integer update(User user) {
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		Integer update = mapper.update(user);
		session.close();
		return update;
	}
	
	//delete by id
	public Integer deleteById(Integer id) {
		SqlSession session = sf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		Integer i = mapper.deleteById(id);
		session.close();
		return i;
	}
}
