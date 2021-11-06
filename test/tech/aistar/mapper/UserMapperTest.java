package tech.aistar.mapper;


import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tech.aistar.entity.User;
import tech.aistar.util.MybatisUtil;

import java.util.Date;
import java.util.List;

/**
 * 本类用来演示: 单元测试
 *
 * @author: Q
 * @date: 2021/10/23 1:20 下午
 */
public class UserMapperTest {

    private SqlSession sqlSession;

    private UserMapper userMapper;

    @Before
    public void testInit() {
        //1. 获取SqlSession对象 - 和数据库进行连接
        sqlSession = MybatisUtil.getSqlSession();
        //2. 获取UserMapper
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    //双击选中testFindAll - 右击 Run
    @Test
    public void testFindAll() {
        //3. 调用接口中的方法
        List<User> userList = userMapper.findAll();
        //4. 打印集合
        if (null != userList && userList.size() > 0) {
            //jdk8里面的lambda表达式
            //适合用函数式接口 - 只能拥有一个抽象方法的接口
            //替代匿名内部类
            userList.forEach(e -> System.out.println(e));
        }
    }

    @After
    public void testClose() {
        //5. 关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testFindById() {
//        System.out.println(userMapper.findById(2));
        User user = userMapper.findById(2);
        System.out.println(user);
    }

    @Test
    public void testDelById() {
        int n = userMapper.delById(4);
        sqlSession.commit();//手动提交一下事务
        System.out.println("成功删除了" + n + "行!");
    }

    @Test
    public void testUpdate() {
        //1. 更新的数据一定是在表中存在的.
        //2. 先从db表中数据加载出来.
        User user = userMapper.findByUsername("李代沫");
        user.setPassword("xxxxx");

        userMapper.update(user);

        sqlSession.commit();
    }

    @Test
    public void testSave() {
        //构建出一个User对象出来
        User user = new User(null, "李代沫", "ppp", new Date(), 1);
        userMapper.save(user);
        sqlSession.commit();
    }
}