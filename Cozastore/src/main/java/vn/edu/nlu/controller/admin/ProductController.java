package vn.edu.nlu.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.URLConstant;
import vn.edu.nlu.constant.VariableConstant;
import vn.edu.nlu.model.Product;
import vn.edu.nlu.service.IProductService;

@Controller(value = "productControllerOfAdmin")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = URLConstant.ADMIN_PRODUCT_LIST, method = RequestMethod.GET)
    public ModelAndView showList(@ModelAttribute(VariableConstant.MODEL) Product product) {
        ModelAndView mav = new ModelAndView(PathConstant.ADMIN_PRODUCT_PAGE);
        product.setListResult(productService.findAll());
        mav.addObject(VariableConstant.MODEL, product);
        return mav;
    }

}
