package tech.aistar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import tech.aistar.entity.User;
import tech.aistar.mapper.UserMapper;
import tech.aistar.service.IUserService;
import tech.aistar.util.MybatisUtil;

import java.util.List;

/**
 * 本类用来演示: 用户业务逻辑层的接口
 *
 * @author: Q
 * @date: 2021/10/23 2:39 下午
 */
public class UserServiceImpl implements IUserService {
    @Override
    public PageInfo<User> load(Integer pageNow, Integer pageSize) {
        //TODO... 程序员苦哈哈的地方
        //业务>代码
        //java.python

        //service层调用mapper层
        //1. 和db进行连接,获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2. 获取UserMapper对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //4. 使用分页插件 - 非侵入式的插件 - JDK动态代理技术[拦截器思想]
        PageHelper.startPage(pageNow,pageSize);

        //3. 调用userMapper中的api方法 - findAll
        List<User> users = userMapper.findAll();

        //5. 构建PageInfo对象
        PageInfo<User> pageInfo = new PageInfo<>(users);

        sqlSession.commit();

        //6. 关闭资源
        sqlSession.close();

        return pageInfo;
    }
}
