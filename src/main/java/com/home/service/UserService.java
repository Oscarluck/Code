package com.home.service;

import com.home.vo.User;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
public interface UserService extends BaseService<User>{
    public User get(String userId);
    public <T> void testVarargs(T... args);
}
