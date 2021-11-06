package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tech.aistar.entity.Phone;
import tech.aistar.util.MybatisUtil;

import java.util.List;

/**
 * 本类用来演示: 单元测试
 *
 * @author: Q
 * @date: 2021/10/25 4:20 上午
 */

public class PhoneMapperTest {

    private SqlSession sqlSession;

    private PhoneMapper phoneMapper;

    @Before
    public void testInit(){
        //1. 获取SqlSession对象 - 和数据库进行连接
        sqlSession = MybatisUtil.getSqlSession();
        //2.获取PhoneMapper
        phoneMapper=sqlSession.getMapper(PhoneMapper.class);
    }

    @Test
    public void testFindAll(){
        List<Phone> phoneList=phoneMapper.findAll();
        if(null!=phoneList && phoneList.size()>0){

            phoneList.forEach(e -> System.out.println(e));
        }
    }

    @Test
    public void testFindById(){
        System.out.println(phoneMapper.findById(4));
    }

    @Test
    public void testDelById(){
        int n = phoneMapper.delById(5);
        sqlSession.commit();
        System.out.println("成功删除了" + n + "行!");
    }

    @Test
    public void testUpdate(){
        Phone phone = phoneMapper.findByPhoneName("一加");
        phone.setRemark("好手机");

        phoneMapper.update(phone);

        sqlSession.commit();
    }

    @Test
    public void testSave(){
        Phone phone=new Phone(null,"OPPO","oppo.png", 2999F,"垃圾手机",2);
        phoneMapper.save(phone);
        sqlSession.commit();
    }

    @After
    public void testClose(){
        sqlSession.close();
    }
}