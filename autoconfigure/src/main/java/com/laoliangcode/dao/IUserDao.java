package com.laoliangcode.dao;

import com.laoliangcode.model.User;

/**
 * {@link User} 数据访问接口
 * @author laoliangcode
 * @version 1.0
 * @since 2018/12/16
 */
public interface IUserDao {

    User findBId(Integer id);
}
