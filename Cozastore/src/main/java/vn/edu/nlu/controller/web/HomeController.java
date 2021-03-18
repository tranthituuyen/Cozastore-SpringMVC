package vn.edu.nlu.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.URLConstant;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

    @RequestMapping(value = URLConstant.USER_HOME, method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        ModelAndView mav = new ModelAndView(PathConstant.USER_HOME_PAGE);
        return mav;
    }

    @RequestMapping(value = URLConstant.LOGIN, method = RequestMethod.GET)
    public ModelAndView getLoginPage() {
        ModelAndView mav = new ModelAndView(PathConstant.LOGIN_PAGE);
        return mav;
    }
}
