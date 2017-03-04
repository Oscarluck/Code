package com.home.action;

import java.io.IOException;
import java.util.Random;

import com.home.service.UserService;
import com.home.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhiwen.cao on 2017/1/20.
 */
@Controller
public class LoginAction {
    @Autowired
    private UserService userService;
    @RequestMapping("/login.do")
    public ModelAndView login(HttpServletRequest request) throws IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        //TODO (Oscar.cao,2017.2.15,[2017.3.2])
        User user = userService.get(userName);
        ModelAndView view = new ModelAndView();
        //FIXME (Oscar.cao,2017.2.15,[2017.3.2])
        if(user == null || !password.equals(user.getPassword())){
            view.setViewName("forward:/login.jsp");
            return view;
        }
        view.setViewName("forward:/index.jsp");
        return view;
    }
}
