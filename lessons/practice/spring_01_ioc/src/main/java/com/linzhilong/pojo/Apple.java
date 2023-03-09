package com.linzhilong.pojo;

public class Apple {
    private String name;
    private String origin;
    private String color;

    public Apple() {
    }

    public Apple(String name, String origin, String color) {
        this.name = name;
        this.origin = origin;
        this.color = color;
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
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "apple{name = " + name + ", origin = " + origin + ", color = " + color + "}";
    }
}
