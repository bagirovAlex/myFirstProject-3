package homework.lesson1;

public class Main1 {
    public static void main(String[] args) {
        short myMoney = 1000;  //Всего денег.
        short pPizza = 230;    //Цена пиццы.
        short pZvachka = 26;   //Цена жвачки.
        float pKonfeta = 2.5f; //Цена конфеты.

        int cPizza = myMoney / pPizza;        //Количество пиццы, которые можно купить.
        int myMoney1 = myMoney % pPizza;      //Количество денег после покупки пиццы.
        int cZvachka = myMoney1 / pZvachka;   //Колическвто жвачек, которое можно купить на остаток денег после покупки пиццы.
        int myMoney2 = myMoney1 % pZvachka;   //Количество денег после покупки жвачек.
        float cKonfeta = myMoney2 / pKonfeta; //Колическвто конфет, которое можно купить на остаток денег после покупки жвачек.
        int cKonfeta2 = (short)cKonfeta;      //Преобразование количества конфет в целое число.

        System.out.println("На эти деньги мы можем купить");
        System.out.println("- " + cPizza + " пиццы");
        System.out.println("- " + cZvachka + " жвачек");
        System.out.println("- " + cKonfeta2 + " конфет");


    }
}
