package tech.aistar.myb;



import org.apache.ibatis.session.SqlSession;
import tech.aistar.entity.User;
import tech.aistar.mapper.UserMapper;
import tech.aistar.util.MybatisUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示: 体验
 *
 * @author: Q
 * @date: 2021/10/23 10:51 上午
 */
public class HelloMybatis {
    public static void main(String[] args) {
        //0
        //1. 获取SqlSession对象 - 和数据库进行连接
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //2. 获取UserMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //3. 调用接口中的方法
        List<User> userList = userMapper.findAll();
        //4. 打印集合
        if(null!=userList && userList.size()>0){
            //jdk8里面的lambda表达式
            //适合用函数式接口 - 只能拥有一个抽象方法的接口
            //替代匿名内部类
            userList.forEach(e-> System.out.println(e));
        }
        //SQL按照功能分成
        //DDL - 数据定义语言 - create drop alter
        //DCL - grant revoke - 授权,取消授权.
        //DML - 数据操纵语言 insert update delete

        //DQL操作 - select查询 -> 最难的.

        //TCL/DTL  事务控制语言

        //所有的DML操作都需要手动提交事务
        //mybatis事务中,默认是手动提交的.
        sqlSession.commit();//内存中的改变同步到磁盘中.

        //5. 关闭sqlSession
        sqlSession.close();
    }
}