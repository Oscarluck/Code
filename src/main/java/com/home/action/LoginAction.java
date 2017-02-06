package com.home.action;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhiwen.cao on 2017/1/20.
 */
@Controller
public class LoginAction {
    @RequestMapping("/login.do")
    public ModelAndView login() throws IOException {
        ModelAndView view = new ModelAndView();
        view.setViewName("forward:/index.jsp");
        return view;
    }
}
