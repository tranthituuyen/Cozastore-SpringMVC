package vn.edu.nlu.controller.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.URLConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

    @RequestMapping(value = URLConstant.USER_HOME, method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        return new ModelAndView(PathConstant.USER_HOME_PAGE);
    }

    @RequestMapping(value = URLConstant.LOGIN, method = RequestMethod.GET)
    public ModelAndView getLoginPage() {
        return new ModelAndView(PathConstant.LOGIN_PAGE);
    }

    @RequestMapping(value = URLConstant.LOGOUT, method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return new ModelAndView(URLConstant.REDIRECT_HOME_PAGE);
    }

    @RequestMapping(value = URLConstant.ACCESS_DENIED, method = RequestMethod.GET)
    public ModelAndView accessDenied() {
        return new ModelAndView(URLConstant.REDIRECT_ACCESS_DENIED);
    }
}
