package vn.edu.nlu.utils;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import vn.edu.nlu.dto.MyUser;

import java.util.ArrayList;
import java.util.List;

public class SecurityUtils {

    public static MyUser getPrincipal() {
        return (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
    }

    @SuppressWarnings("unchecked")
    public static List<String> getAuthorities() {
        List<String> results = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority authority : authorities) {
            results.add(authority.getAuthority());
        }
        return results;
    }
}
