package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * GreetingController
 *
 * @author yclimb
 * @date 2018/2/24
 */
@RestController
public class GreetingController {

    /**
     * 模版语句，%s 表示可替换字符串
     */
    private static final String template = "Hello, %s!";
    /**
     * 数字对象，用于自增id
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * hello restful web
     * @param name 名字
     * @return 对象
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // counter.incrementAndGet() 此语句返回自增量数字，1.2.3.4...
        // String.format(template, name) 此语句用于替换字符串，将 %s 替换为 name
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}