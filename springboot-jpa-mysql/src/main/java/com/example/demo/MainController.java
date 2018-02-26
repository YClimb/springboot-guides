package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * main controller
 *
 * @author yclimb
 * @date 2018/2/26
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired // This means to get the bean called userRepository
    private UserRepository userRepository; // 自动注入生成的对象，逻辑处理层

    /**
     * 新增用户方法
     * @param name 用户名
     * @param email 邮箱
     * @return str
     */
    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody 返回的是响应字符串，而不是一个视图
        // @RequestParam GET或者POST请求参数

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // 将返回一个JSON或者XML的用户
        return userRepository.findAll();
    }
}