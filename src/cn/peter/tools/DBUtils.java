package cn.peter.tools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtils {

	private static SqlSessionFactory sf;
	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sf = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return sf;
	}
	
	public static void main(String[] args) {
		System.out.println(sf);
	}

}
