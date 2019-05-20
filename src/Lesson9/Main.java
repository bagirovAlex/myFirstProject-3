package Lesson9;

public class Main {
    public static void main(String[] args) {

        //формула создания нового типа данных
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setPrise(10000);
        saomi.setPrise(8000);

        System.out.println(meizu.getPrise());

        //Парадигмы ООП http://publicstatic.ru/paradigmy-oop/

            // 1) Инкапсуляция: Модификатор доступа - это слово которое ограничивает доступ.
            // Пишется перед 1.Классом, 2.Переменной, 3.Конструктором, 4.Методом
             //public - доступ в рамках проекта
             //default - внутри пакета (lesson9)
              //protected -
             //private - доступ только внутри класса

        meizu.setDiagonal(8);
        saomi.setDiagonal(5.5);
        System.out.println(meizu.getDiagonal());

        meizu.setModel("jhgugf");
        System.out.println(meizu.getModel());
    }
}
