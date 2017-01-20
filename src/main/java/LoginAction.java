import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhiwen.cao on 2017/1/20.
 */
@Controller
public class LoginAction {

    @RequestMapping("/login.do")
    public ModelAndView login(HttpServletRequest request,
                              HttpServletResponse response) throws IOException {
        ModelAndView view = new ModelAndView();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        view.setViewName("redirect:/index.jsp");
        return view;
    }
}
