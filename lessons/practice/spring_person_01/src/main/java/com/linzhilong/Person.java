package com.linzhilong;

public class Person {
    private String name;
    private Dog dog;
    private Cat cat;

    public Person() {
    }

    public Person(String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
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
     * @return dog
     */
    public Dog getDog() {
        return dog;
    }

    /**
     * 设置
     * @param dog
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    /**
     * 获取
     * @return cat
     */
    public Cat getCat() {
        return cat;
    }

    /**
     * 设置
     * @param cat
     */
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String toString() {
        return "Person{name = " + name + ", dog = " + dog + ", cat = " + cat + "}";
    }

    public void raiseDog() {
        System.out.println(name + "养了狗是: " + dog.getName());
    }

    public void raiseCat() {
        System.out.println(name + "养了猫是: " + cat.getName());
    }
}
