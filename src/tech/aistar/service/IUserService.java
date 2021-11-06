package tech.aistar.service;

import com.github.pagehelper.PageInfo;
import tech.aistar.entity.User;

import java.util.List;

/**
 * 本类用来演示: 用户的业务接口
 *
 * 接口负责定义规范/功能
 *
 * 实现类 - 功能的具体的实现.
 *
 * @author: Q
 * @date: 2021/10/23 2:36 下午
 */
public interface IUserService {

    /**
     * 分页操作
     * @param pageNow 当前页
     * @param pageSize 每页显示条数
     * @return
     */
    PageInfo<User> load(Integer pageNow, Integer pageSize);
}
