package org.spring_demo;

public class Person {
    private String name;
    private  String family;
    private int age;

    //hard injection
    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }
}
