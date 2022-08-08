package org.spring_demo;

public class Person {
    private String name;
    private  String family;
    private int age;
    private Book book;

    //hard injection


    public Person(String name, String family, int age, Book book) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.book = book;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void init(){
        System.out.println("Person Sara Created");
    }
    public void destroy(){
        System.out.println("Person Sara Destroy");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
