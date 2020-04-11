package com.gupao.service;

import com.gupao.domain.User;

import java.util.Collection;

public interface UserService {

    /**
     * 保存用户
     * @param user
     * @return 成功返回<code>true</code> 失败返回<code>false</code>
     */
    boolean save(User user);

    /**
     * 查询所有的用户对象
     * @return  不会返回<code>null</code>
     */
    Collection<User> findAll();



}
