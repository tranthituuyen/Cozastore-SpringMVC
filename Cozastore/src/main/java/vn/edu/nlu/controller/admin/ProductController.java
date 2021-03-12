package vn.edu.nlu.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.URLConstant;

@Controller(value = "productControllerOfAdmin")
public class ProductController {

    @RequestMapping(value = URLConstant.ADMIN_PRODUCT_LIST, method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView mav = new ModelAndView(PathConstant.ADMIN_PRODUCT_PAGE);
        return mav;
    }

}
