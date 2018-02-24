package com.example.demo;

/**
 * model
 *
 * @author yclimb
 * @date 2018/2/24
 */
public class Greeting {
    /**
     * 编号，自增量
     */
    private final long id;
    /**
     * 内容
     */
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
