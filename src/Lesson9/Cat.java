package Lesson9;

public class Cat {
    //Переменные
    private String poroda;
    private int age;
    private double dlinnaHvosta;

    //Конструкторы
    public Cat() {

    }

    public Cat(int newAge, String por, double dh) {
        age = newAge;
        poroda = por;
        dlinnaHvosta = dh;
    }

    //Методы
    public void setPoroda(String newPoroda) {
        poroda = newPoroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAgea() {
        return age;
    }

    public void setdlinnaHvosta(double newdlinnaHvosta) {
        dlinnaHvosta = newdlinnaHvosta;
    }

    public double getDlinnaHvosta() {
        return dlinnaHvosta;
    }

}
