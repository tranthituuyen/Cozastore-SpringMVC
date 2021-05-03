package vn.edu.nlu.constant;

public class URLConstant {
    // api
    public static final String API_PRODUCT = "/api/san-pham";

    // admin
    public static final String ADMIN_HOME = "/quan-tri/trang-chu";
    public static final String ADMIN_PRODUCT_LIST = "/quan-tri/san-pham/danh-sach";
    public static final String ADMIN_PRODUCT_EDIT = "/quan-tri/san-pham/chinh-sua";

    // user
    public static final String USER_HOME = "/trang-chu";
    public static final String LOGIN = "/dang-nhap";
    public static final String LOGOUT = "/thoat";

    // security
    public static final String ACCESS_DENIED = "/accessDenied";
    public static final String REDIRECT_HOME_PAGE = "redirect:/trang-chu";
    public static final String REDIRECT_ACCESS_DENIED = "redirect:/dang-nhap?accessDenied";
}
