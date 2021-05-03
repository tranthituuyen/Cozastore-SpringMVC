package vn.edu.nlu.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.nlu.constant.PathConstant;
import vn.edu.nlu.constant.SystemConstant;
import vn.edu.nlu.constant.URLConstant;
import vn.edu.nlu.dto.ProductDTO;
import vn.edu.nlu.service.IProductService;

@Controller(value = "productControllerOfAdmin")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = URLConstant.ADMIN_PRODUCT_LIST, method = RequestMethod.GET)
    public ModelAndView showList(@RequestParam(SystemConstant.PAGE) int page,
                                 @RequestParam(SystemConstant.LIMIT) int limit) {
        ProductDTO model = new ProductDTO();
        model.setPage(page);
        model.setLimit(limit);
        ModelAndView mav = new ModelAndView(PathConstant.ADMIN_PRODUCT_PAGE);
        Pageable pageable = new PageRequest(page - 1, limit);
        model.setListResult(productService.findAll(pageable));
        model.setTotalItem(productService.getTotalItem());
        model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
        mav.addObject(SystemConstant.MODEL, model);
        return mav;
    }

    @RequestMapping(value = URLConstant.ADMIN_PRODUCT_EDIT, method = RequestMethod.GET)
    public ModelAndView editProduct() {
        return null;
    }
}
