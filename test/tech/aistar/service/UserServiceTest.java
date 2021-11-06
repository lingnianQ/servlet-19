package tech.aistar.service;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import tech.aistar.entity.User;
import tech.aistar.service.impl.UserServiceImpl;

import java.util.List;

/**
 * 本类用来演示: 业务逻辑层的测试
 *
 * @author: Q
 * @date: 2021/10/23 2:47 下午
 */
public class UserServiceTest {

    private IUserService userService = new UserServiceImpl();

    @Test
    public void testLoad(){
        PageInfo<User> pageInfo = userService.load(1,2);

        System.out.println("当前页:"+pageInfo.getPageNum());
        System.out.println("每页显示条数:"+pageInfo.getPageSize());
        System.out.println("总的页数:"+pageInfo.getPages());
        System.out.println("分页的数据如下:");
        List<User> userList = pageInfo.getList();
        if(null!=userList && userList.size()>0){
            userList.forEach(System.out::println);
        }
    }
}
