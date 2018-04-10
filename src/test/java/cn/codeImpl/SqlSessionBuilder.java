package cn.codeImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.entity.Role;

public class SqlSessionBuilder {

	@Test
	public void main() throws IOException {
		String resource = "cn/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = ssf.openSession();
		try {

			// 生成SqlSessionFactory
//			 Role role = new Role();
//			 role.setRoleName("roleOne");
//			 role.setRoleDesc("this is one role");
//			 sqlSession.insert("insertRole", role);
//			 sqlSession.commit();
			List<Role> roleList = sqlSession.selectList("selectRoles", "");
			System.out.println("====================="+roleList);
			System.out.println(ssf.getConfiguration().isUseGeneratedKeys());
		} catch (Exception e) {
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
	}
}