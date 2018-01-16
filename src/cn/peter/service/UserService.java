package cn.peter.service;

import java.util.List;

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
		Integer save = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			save = mapper.save(user);
			System.out.println(user.getId());
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return save;
	}
	
	//select by id
	public User getUserById(Integer id) {
		SqlSession session = sf.openSession();
		User user = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			user = mapper.getUserById(id);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return user;
	}
	
	//select by name
	public List<User> listUserByName(String name){
		SqlSession session = sf.openSession();
		List<User> list = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.listUserByName(name);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return list;
	}
	
	//update
	public Integer update(User user) {
		SqlSession session = sf.openSession();
		Integer update = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			update = mapper.update(user);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return update;
	}
	
	//delete by id
	public Integer deleteById(Integer id) {
		SqlSession session = sf.openSession();
		Integer i = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			i = mapper.deleteById(id);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return i;
	}
}
