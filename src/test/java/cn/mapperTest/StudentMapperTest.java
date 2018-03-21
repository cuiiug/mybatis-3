package cn.mapperTest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class StudentMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("cn/mybatis-config.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void showDefaultCacheConfiguration() {
        System.out.println("本地缓存：" + factory.getConfiguration().getLocalCacheScope());
        System.out.println("二级缓存是否被启用：" + factory.getConfiguration().isCacheEnabled());
        factory.openSession();
    }

}