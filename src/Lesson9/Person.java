package Lesson9;

public class Person {
    private int age;
    private String name;
    private String sername;
    private long phoneNumbers;

    //Конструкторы

    //1) по умолчанию
    public Person() {
    }

    //2)
    public Person(int ag, String names, String sern, long phone) {
        age = ag;
        name = names;
        phoneNumbers = phone;
    }

    //3)
    public Person(int age, String name, String sern) {
    }

    //4)
    public Person(int age, String name) {
    }

    //5)
    public Person(int age) {
    }

    //6)
    public Person(String name, String sern) {
    }

    //7)
    public Person(long phone, String sern) {
    }

    //8)
    public Person(long phone) {
    }

    //9)
    public Person(int age, String sern, long phone) {
    }



}
