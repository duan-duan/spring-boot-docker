package com.harry.docker.demo;

/**
 * @Description: pojo
 * @author: wangruirui
 * @date: 2018/09/11
 */
public class Request {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
