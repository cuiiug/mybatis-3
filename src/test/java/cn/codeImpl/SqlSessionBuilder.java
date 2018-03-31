package cn.codeImpl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class SqlSessionBuilder {

    public static void main(String[] args) {
        System.out.println("关键");
    }
    @Test
    public void main() throws IOException {
        //生成SqlSessionFactory
        String resource = "cn/mybatis-config.xml";
        System.out.println("关键");
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println("=====================");
        System.out.println(ssf.getConfiguration().getDatabaseId());
    }
}