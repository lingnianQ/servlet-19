package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tech.aistar.entity.PhoneType;
import tech.aistar.util.MybatisUtil;

import java.util.List;

/**
 * 本类用来演示: 用户实体类
 *
 * @author: Q
 * @date: 2021/10/25 5:35上午
 */
public class PhoneTypeMapperTest {


    private SqlSession sqlSession;
    private PhoneTypeMapper phoneTypeMapper;

    @Before
    public void testInit(){
        sqlSession= MybatisUtil.getSqlSession();
        phoneTypeMapper=sqlSession.getMapper(PhoneTypeMapper.class);
    }

    /**
     * 查询所有产品类型*/
    @Test
    public void testFindAll(){
        List<PhoneType> phoneTypeList= phoneTypeMapper.findAll();
        if(null!=phoneTypeList && phoneTypeList.size()>0){
            phoneTypeList.forEach(e -> System.out.println(e));
        }
    }

    @After
    public void testClose(){
        sqlSession.close();
    }
}
