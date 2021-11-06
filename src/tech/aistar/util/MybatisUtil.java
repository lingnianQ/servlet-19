package tech.aistar.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本类用来演示: 自定义mybatis工具类
 *
 * @author: Q
 * @date: 2021/10/23 10:44 上午
 */
public class MybatisUtil {

    //SqlSessionFactory  - 重量级的对象[单例,利用static关键字特性],作用负责创建SqlSession
    private static SqlSessionFactory factory;

    static{
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //提供公开的静态的方法来返回SqlSession
    //SqlSession = Connection[连接] + Cache[一级缓存]
    public static SqlSession getSqlSession(){
        return factory == null?null:factory.openSession();
    }
}
