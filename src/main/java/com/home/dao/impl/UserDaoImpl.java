package com.home.dao.impl;

import com.home.dao.UserDao;
import com.home.vo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
