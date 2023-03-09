package com.linzhilong.pojo;

public class Child {
    private String name;

    private Apple apple;

    public Child() {
    }

    public Child(String name, Apple apple) {
        this.name = name;
        this.apple = apple;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return apple
     */
    public Apple getApple() {
        return apple;
    }

    /**
     * 设置
     * @param apple
     */
    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public String toString() {
        return "Child{name = " + name + ", apple = " + apple + "}";
    }
}
