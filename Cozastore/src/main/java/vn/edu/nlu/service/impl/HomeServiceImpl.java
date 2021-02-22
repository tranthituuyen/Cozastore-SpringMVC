package vn.edu.nlu.service.impl;

import org.springframework.stereotype.Service;
import vn.edu.nlu.service.HomeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public List<String> loadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Blog java");
        menus.add("Hướng dẫn học javaweb");
        menus.add("Liên hệ");
        menus.add("Thanh toán");
        return menus;
    }
}
