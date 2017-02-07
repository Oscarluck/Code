package com.home.service.impl;

import com.home.dao.impl.BaseDaoImpl;
import com.home.service.UserService;
import com.home.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
@Service("userService")
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    public User get(String userId) {
        User user = new User();
        user.setUserId(userId);
        log.info(user.getUserName());
        return this.findOne(User.class,"userId",userId);
    }
}
