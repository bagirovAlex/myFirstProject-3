package Lesson6;

public class Student {

    //формула создания метода (выучить!)

    //1-модификатор доступа (public, private, protected, пустое место)
    //public - доступ по всему проекту
    //protected - доступ только внутри текущщего класса и его наследников
    //private - доступ только внутри текущщего класса
    //"пустое место" (без модификатора) - доступ внутре текущей папки Lesson6

    //2 - слово static (ни к кому не обращаюсь)  есть или нет-(когда к конкретному объекту обращение)

    //3 - указывается возвращаемый тип (String, char[].....) или если нет возвращаемого типа то указываес слово void

    //4 - название метода в произвольной форме, только с маленькой буквы как переменные.

    //5 - Внутри () входящие параметры через запятую с указанием типа и название переменной.

    //6 - {} тело метода. То что будет выполняться когда этот метод вызвать.

    public static int summTrexChisel(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static int perimetrPr(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static void printConsol(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println("Привет!");

        }

    }
    public static void whatNumber(int b){
        if (b % 2 == 0) {
            System.out.println("Четное.");
        } else {
            System.out.println("Нечетное.");
        }

    }


}
