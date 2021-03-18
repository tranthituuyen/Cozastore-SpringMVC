package vn.edu.nlu.security;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomSuccessHandler { // extends SimpleUrlAuthenticationSuccessHandler

//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    @Override
//    public RedirectStrategy getRedirectStrategy() {
//        return redirectStrategy;
//    }
//
//    @Override
//    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
//        this.redirectStrategy = redirectStrategy;
//    }
//
//    @Override
//    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
//            throws IOException, ServletException {
//        String targetUrl = determineTargetUrl(authentication);
//        if (response.isCommitted()) {
//            return;
//        }
//        redirectStrategy.sendRedirect(request, response, targetUrl);
//    }
//
//    private String determineTargetUrl(Authentication authentication) {
//        String url = "";
//        List<String> roles = SecurityUtils.getAuthorities();
//        if (isAdmin(roles)) {
//            url = URLConstant.ADMIN_HOME;
//        } else if (isUser(roles)) {
//            url = URLConstant.USER_HOME;
//        }
//        return url;
//    }

    private boolean isAdmin(List<String> roles) {
        return roles.contains("ADMIN");
    }

    private boolean isUser(List<String> roles) {
        return roles.contains("USER");
    }
}
