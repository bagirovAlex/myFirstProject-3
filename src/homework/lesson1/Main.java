package homework.lesson1;

public class Main {
    public static void main(String[] args) {
        int myMoney = 1000;
        int prisePizza = 230;
        int priseZvachka = 26;
        double priseKonfeta = 2.5;

        int countPizza = myMoney / prisePizza;
        int ostatok = myMoney - prisePizza * countPizza;
        int countZvachka = ostatok / priseZvachka;
        int ostatok1 = myMoney - (countPizza * prisePizza + countZvachka * priseZvachka);
        double countKonfeta = ostatok1 / priseKonfeta;


        System.out.println("На эти деньги мы можем купить");
        System.out.println("- " + countPizza + " пиццы");
        System.out.println("- " + countZvachka + " жвачки");
        System.out.println("- " + countKonfeta + " конфет");
    }
}
