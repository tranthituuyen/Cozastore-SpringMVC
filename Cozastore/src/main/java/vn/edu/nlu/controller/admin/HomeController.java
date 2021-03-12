package vn.edu.nlu.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.URLConstant;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {

    @RequestMapping(value = URLConstant.ADMIN_HOME, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView(PathConstant.ADMIN_HOME_PAGE);
        return mav;
    }
}
